using System;
using System.Collections.Generic;

namespace MySuperBootCampConsoleApp
{
    class Program
    {
        static void Main(string[] args)
        {
            MoneyTransfer transfer = new MoneyTransfer();
            transfer.Currency = "RUB";
            transfer.Money = 100;
            transfer.FromAccount = "RZB 09887867476475";
            transfer.ToAccount = "ALF 345345345";
            transfer.Provider = 0;

            TransferManager transferManager = new TransferManager();

            transferManager.DoTransfer(transfer);
        }
    }

    public class MoneyTransfer
    {
        public decimal Money { get; set; }

        public string FromAccount { get; set; }

        public string ToAccount { get; set; }

        public string Currency { get; set; }

        public int Provider { get; set; }

    }

    public class TransferManager
    {
        /*
         *
         *  B2B = 0
         *  B2P = 1
         *  P2B = 2
         *  .....
         *
         */
        public void DoTransfer(MoneyTransfer transfer)
        {
            /// Цепочку можно построить проще, не через конструктор, но высока вероятность, что потеряется звено.
            /// Рекомендую использовать либо так, либо через внедрение зависимостей
            CheckFraudExternalMiddleware externalMiddleware = 
                new CheckFraudExternalMiddleware(
                    new CheckFraudLocalMiddleware(
                        new B2BTransferMiddleware(
                            new B2PTransferMiddleware(
                                new P2BTransferMiddleware(null)))));

            externalMiddleware.Process(transfer);

            /* Паттерн позволяет избавиться от чрезмерного большого switch
            switch (transfer.Provider)
            {
                case 0:
                {
                    CheckFraudExternal(transfer);
                    CheckFraudLocal(transfer);
                    TransferViaB2B(transfer);
                }
                    break;
                case 1:
                {
                    CheckFraudLocal(transfer);
                    TransferViaB2P(transfer);
                }
                    break;
                case 2:
                {
                    CheckFraudLocal(transfer);
                    TransferViaP2B(transfer);
                }
                    break;
            }*/
        }


    }

    /// <summary>
    /// Класс абстракция над всеми звеньями
    /// </summary>
    public abstract class TransferMiddleware
    {
        private TransferMiddleware _next;

        protected TransferMiddleware(TransferMiddleware next)
        {
            _next = next;
        }

        /// <summary>
        /// Типичная логика запуска цепочки
        /// </summary>
        /// <param name="transfer"></param>
        public void Process(MoneyTransfer transfer)
        {
            if (CanDo(transfer))
            {
                bool next = Do(transfer);

                if (next == false)
                {
                    return;
                }
            }

            if (_next == null)
            {
                return;
            }

            _next.Process(transfer);
        }

        /// <summary>
        /// Проверка на может ли отработать данное звено
        /// </summary>
        /// <param name="transfer"></param>
        /// <returns></returns>
        protected abstract bool CanDo(MoneyTransfer transfer);

        /// <summary>
        /// Сама логика звена
        /// </summary>
        /// <param name="transfer"></param>
        /// <returns></returns>
        protected abstract bool Do(MoneyTransfer transfer);
    }

    public class B2BTransferMiddleware : TransferMiddleware
    {
        public B2BTransferMiddleware(TransferMiddleware next) : base(next)
        {
        }

        protected override bool CanDo(MoneyTransfer transfer)
        {
            if (transfer == null)
            {
                return false;
            }

            if (transfer.Provider == 0)
            {
                return true;
            }

            return false;
        }

        protected override bool Do(MoneyTransfer transfer)
        {
            System.Console.WriteLine("B2B логика");

            return true;
        }
    }

    public class B2PTransferMiddleware : TransferMiddleware
    {
        public B2PTransferMiddleware(TransferMiddleware next) : base(next)
        {
        }

        protected override bool CanDo(MoneyTransfer transfer)
        {
            if (transfer == null)
            {
                return false;
            }

            if (transfer.Provider == 1)
            {
                return true;
            }

            return false;
        }

        protected override bool Do(MoneyTransfer transfer)
        {
            System.Console.WriteLine("B2P логика");

            return true;
        }
    }

    public class P2BTransferMiddleware : TransferMiddleware
    {
        public P2BTransferMiddleware(TransferMiddleware next) : base(next)
        {
        }

        protected override bool CanDo(MoneyTransfer transfer)
        {
            if (transfer == null)
            {
                return false;
            }

            if (transfer.Provider == 2)
            {
                return true;
            }

            return false;
        }

        protected override bool Do(MoneyTransfer transfer)
        {
            System.Console.WriteLine("P2B логика");

            return true;
        }
    }

    public class CheckFraudLocalMiddleware : TransferMiddleware
    {
        public CheckFraudLocalMiddleware(TransferMiddleware next) : base(next)
        {
        }

        protected override bool CanDo(MoneyTransfer transfer)
        {
            if (transfer == null)
            {
                return false;
            }

            return true;
        }

        protected override bool Do(MoneyTransfer transfer)
        {
            System.Console.WriteLine("Local fraud проверка логика");

            return true;
        }
    }

    public class CheckFraudExternalMiddleware : TransferMiddleware
    {
        public CheckFraudExternalMiddleware(TransferMiddleware next) : base(next)
        {
        }

        protected override bool CanDo(MoneyTransfer transfer)
        {
            if (transfer == null)
            {
                return false;
            }

            if (transfer.Provider == 0)
            {
                return true;
            }

            return false;
        }

        protected override bool Do(MoneyTransfer transfer)
        {
            System.Console.WriteLine("External fraud проверка логика");

            return true;
        }
    }
}
