public class Dog {
    int size;
    String breed;
    String name;

    public static void main(String[] args) {
//        make a Dog object and access it
        Dog dog1 = new Dog();
        dog1.bark(1);
        dog1.name = "Bart";

//        now make a Dog array
        Dog[] myDogs = new Dog[3];
//        and put some dogs in it
        myDogs[0] = new Dog();
        myDogs[1] = new Dog();
        myDogs[2] = dog1;

//        now access the Dogs using the array refferences
        myDogs[0].name = "Fred";
        myDogs[1].name = "Marge";

//        hmmmm... what is myDogs[2] name?
        System.out.print("last dog`s name is ");
        System.out.println(myDogs[2].name);

//        now loop through the array
//        and tell all dogs to bark
        int x = 0;
        while (x < myDogs.length) {
            myDogs[x].bark(1);
            x = x + 1;
        }
    }
    void bark(int numOfBarks) {
        while (numOfBarks > 0) {
            if (size > 60) {
                System.out.println("Wooof! Wooof!");
            } else if (size > 14) {
                System.out.println("Ruff! Ruff!");
            } else {
                System.out.println("Yip! Yip!");
            }
            numOfBarks--;
        }
    }

    public void eat() {}
    public void chaseCat() {}
}
