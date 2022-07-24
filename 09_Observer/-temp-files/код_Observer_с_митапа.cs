using System;
using System.Collections.Generic;

namespace MySuperBootCampConsoleApp
{
    class Program
    {
        static void Main(string[] args)
        {
            Person personReviewer = new Person();
            personReviewer.Id = 1;
            personReviewer.Name = "Корректор";

            Person personAuthor = new Person();
            personAuthor.Id = 2;
            personAuthor.Name = "Автор";

            Person personCommentator = new Person();
            personCommentator.Id = 3;
            personCommentator.Name = "Комментатор";

            Document document = new Document();
            document.AddSubscriber(personReviewer);
            document.AddSubscriber(personAuthor);
            document.AddSubscriber(personCommentator);

            document.AddText("Привет, Мир!");
        }
    }

    public class Document
    {
        private List<Subscriber> _subscribers = new List<Subscriber>();

        public string Body { get; private set; }

        /// <summary>
        /// Изменяем текст документа и соответсвенно вызываем событие
        /// </summary>
        /// <param name="text"></param>
        public void AddText(string text)
        {
            Body += text;

            ///Уведомляем об изменение документа
            NotifySubscribers();
        }

        public void AddSubscriber(Subscriber subscriber)
        {
            _subscribers.Add(subscriber);
        }

        private void NotifySubscribers()
        {
            ///Бежим по подписчикам и уведомляем об изменении. Аргументом передаем себя же (изменившийся документ)
            foreach (Subscriber subscriber in _subscribers)
            {
                subscriber.Notification(this);
            }
        }
    }

    /// <summary>
    /// Асбтракция подписчика
    /// </summary>
    public abstract class Subscriber
    {
        public abstract void Notification(Document document);
    }

    /// <summary>
    /// Реализация подписчика
    /// </summary>
    public class Person : Subscriber
    {
        public int Id { get; set; }
        
        public string Name { get; set; }

        /// <summary>
        /// Метод, который вызывается при событии, то есть уведомление приходят сюда
        /// </summary>
        /// <param name="document"></param>
        public override void Notification(Document document)
        {
            System.Console.WriteLine(Name + " :" + document.Body);
        }
    }
}
