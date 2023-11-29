package Automation001;

public class StudentsOfQA {
    public static void main(String[] args) {
        Students stud1 = new Students();
        stud1.id = 1;
        stud1.first_name = "Farisha";
        stud1.last_name = "Rahman";
        System.out.println(stud1.id +" "+ stud1.first_name +" "+ stud1.last_name);

        Students stud2 = new Students();
        stud2.id = 2;
        stud2.first_name = "James";
        stud2.last_name = "Brown";
        System.out.println(stud2.id +" "+ stud2.first_name +" "+ stud2.last_name);

        Students stud3 = new Students();
        stud3.id = 3;
        stud3.first_name = "David";
        stud3.last_name = "Obakope";
        System.out.println(stud3.id +" "+ stud3.first_name +" "+ stud3.last_name);

        Students stud4 = new Students();
        stud4.id = 4;
        stud4.first_name = "Andre";
        stud4.last_name = "Phillips";
        System.out.println(stud4.id +" "+ stud4.first_name +" "+ stud4.last_name);

        Students stud5 = new Students();
        stud5.id = 5;
        stud5.first_name = "Lauren";
        stud5.last_name = "Tolliver";
        System.out.println(stud5.id +" "+ stud5.first_name +" "+ stud5.last_name);

        Students stud6 = new Students();
        stud6.id = 6;
        stud6.first_name = "Salar";
        stud6.last_name = "Zafar";
        System.out.println(stud6.id +" "+ stud6.first_name +" "+ stud6.last_name);

        Students stud7 = new Students();
        stud7.id = 7;
        stud7.first_name = "Frita";
        stud7.last_name = "Ayal";
        System.out.println(stud7.id +" "+ stud7.first_name +" "+ stud7.last_name);

        Students stud8 = new Students();
        stud8.id = 8;
        stud8.first_name = "Abdur";
        stud8.last_name = "Lindon";
        System.out.println(stud8.id +" "+ stud8.first_name +" "+ stud8.last_name);

        Students stud9 = new Students();
        stud9.id = 9;
        stud9.first_name = "Daniel";
        stud9.last_name = "Unknown";
        System.out.println(stud9.id +" "+ stud9.first_name +" "+ stud9.last_name);

        Students stud10 = new Students();
        stud10.id = 10;
        stud10.first_name = "Zuri";
        stud10.last_name = "Morton";
        System.out.println(stud10.id +" "+ stud10.first_name +" "+ stud10.last_name);

    }
}
    class Students{
        int id;
        String first_name;
        String last_name;

        public void Print(){
            System.out.println(id+" "+first_name+" "+last_name);
        }
    }