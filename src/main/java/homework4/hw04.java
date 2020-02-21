package homework4;

public class hw04 {
    //method for initializing schedule array
    public static String[][] schedule() {
        String[][] _schedule = new String[7][2];

        _schedule[0][0] = "monday";
        _schedule[0][1] = "do home work; do sport";
        _schedule[1][0] = "tuesday";
        _schedule[1][1] = "go to courses; watch a film";
        _schedule[2][0] = "wednesday";
        _schedule[2][1] = "do home work; do tests";
        _schedule[3][0] = "thursday";
        _schedule[3][1] = "go to courses; do sport";
        _schedule[4][0] = "friday";
        _schedule[4][1] = "do home work; meeting with friends";
        _schedule[5][0] = "saturday";
        _schedule[5][1] = "go to courses";
        _schedule[6][0] = "sunday";
        _schedule[6][1] = "do home work; do sport";

        return _schedule;
    }

    public static void printChild(Human child){
        System.out.println(child.toString());
        child.greetPet();
        child.describePet();
    }

    public static void printChildsPet(Pet pet){
        System.out.println(pet.toString());
        pet.respond();
        pet.eat();
        pet.foul();
    }

    public static void printMother(Human mother) {
        System.out.println(mother.toString());
        mother.greetPet();
        mother.describePet();
    }

    public static void printFather(Human father) {
        System.out.println(father.toString());
        father.greetPet();
        father.describePet();
    }


        public static void main(String[] args) {
            String[] habits = {"eat", "drink", "sleep"};
            Pet pet1 = new Pet("dog","Rock",3,70,habits);
            Pet pet2 = new Pet("cat","Zeus",5,75,habits);
            Human mother = new Human("Jane","Karleone",1967,80,pet1,"Anna Austen","Ray Austen",schedule());   //mother
            Human father = new Human("Vito","Karleone",1963,80,pet1,"Janet Karleone","Jack Karleone",schedule());   //father
            Human child = new Human("Rachel","Karleone",1994,85,pet2,mother.name,father.name,schedule());   //child

            printChild(child);
            printChildsPet(pet2);

            System.out.println();
            printMother(mother);
            printFather(father);

        }
}
