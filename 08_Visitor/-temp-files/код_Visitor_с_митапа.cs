using System.Collections.Generic;

namespace MySuperBootCampConsoleApp
{
    class Program
    {
        static void Main(string[] args)
        {
            Student student = new Student();
            student.Name = "Василий";
            student.Surname = "Пупкин";
            student.GroupId = 100;

            Teacher teacher = new Teacher();
            teacher.Name = "Аркадий";
            teacher.Surname = "Паровоз";

            School school = new School();

            school.AddStudent(student);
            school.AddTeacher(teacher);

            XmlPersonVisitor xmlPersonVisitor = new XmlPersonVisitor();
            TextPersonVisitor textPersonVisitor = new TextPersonVisitor();

            //Послали нашего гонца
            school.Accept(xmlPersonVisitor);

            //Послали нашего второго гонца
            school.Accept(textPersonVisitor);

        }
    }

    /// <summary>
    /// Абстрактный посетитель, от него наследуем всех остальных, что бы работать исключительно с абстракцией
    /// </summary>
    public abstract class PersonVisitor
    {
        public abstract void ShowInfoTeacher(Teacher teacher);

        public abstract void ShowInfoStudent(Student student);
    }

    /// <summary>
    /// Посетитель для отображения в xml формате
    /// </summary>
    public class XmlPersonVisitor : PersonVisitor
    {
        public override void ShowInfoTeacher(Teacher teacher)
        {
            string info = "<Root><Name>" + teacher.Name + "</Name> <Surname>" + teacher.Surname + "</Surname> <TotalGroups> " + teacher.TotalGroups + "</TotalGroups> </Root>";

            System.Console.WriteLine(info);
        }

        public override void ShowInfoStudent(Student student)
        {
            string info = "<Root><Name>" + student.Name + "</Name> <Surname>" + student.Surname + "</Surname> <GroupId> " + student.GroupId + "</GroupId> </Root>";

            System.Console.WriteLine(info);
        }
    }

    /// <summary>
    /// Посетитель для отображения в текстовом формате персон
    /// </summary>
    public class TextPersonVisitor : PersonVisitor
    {
        public override void ShowInfoTeacher(Teacher teacher)
        {
            string info = "Имя " + teacher.Name + " Фамилия " + teacher.Surname + " Сколько групп ведет " + teacher.TotalGroups;

            System.Console.WriteLine(info);
        }

        public override void ShowInfoStudent(Student student)
        {
            string info = "Имя " + student.Name + " Фамилия " + student.Surname + " Группа " + student.GroupId;

            System.Console.WriteLine(info);
        }
    }


    public abstract class Person
    {
        public string Name { get; set; }

        public string Surname { get; set; }

        public abstract void Visit(PersonVisitor personVisitor);
    }

    public class Student : Person
    {
        public int GroupId { get; set; }

        /// <summary>
        /// Сам потребитель решает, какой метод вызывать
        /// </summary>
        /// <param name="personVisitor">Посетитель</param>
        public override void Visit(PersonVisitor personVisitor)
        {
            personVisitor.ShowInfoStudent(this);
        }
    }

    public class Teacher : Person
    {
        public int TotalGroups { get; set; }

        /// <summary>
        /// Сам потребитель решает, какой метод вызывать
        /// </summary>
        /// <param name="personVisitor">Посетитель</param>
        public override void Visit(PersonVisitor personVisitor)
        {
            personVisitor.ShowInfoTeacher(this);
        }
    }

    public class School
    {
        private List<Person> _persons = new List<Person>();

        public void AddStudent(Student student)
        {
            _persons.Add(student);
        }

        public void AddTeacher(Teacher teacher)
        {
            _persons.Add(teacher);
        }

        /// <summary>
        /// Наш посетитель ушел в путешествие по объектам
        /// </summary>
        /// <param name="personVisitor"></param>
        public void Accept(PersonVisitor personVisitor)
        {
            foreach (Person person in _persons)
            {
                person.Visit(personVisitor);
            }
        }
    }

}
