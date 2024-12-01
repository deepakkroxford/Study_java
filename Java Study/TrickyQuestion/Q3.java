package TrickyQuestion;
class Sol{

    int x;
    int y;
   Sol(int x, int y){
        this.x = x;
        this.y = y;
    }


    public int sum (int x,int y){
        return x+y;
    }
}

class Animal {
    public void eat()
    {
        System.out.println("the animal is eating");
    }
}

// class Dog{
//     public void eat(){
//         System.out.println("the dog is eating");
//     }
// }


// // class cat extend Animal,Dog{
// //     public void eat(){
// //         System.out.println("the cat is eating");
// //     }
    
// // }

interface Animals {
    void eat();
}

interface Pet {
    void play();
}

class Dog implements Animals, Pet {
    @Override
    public void eat() {
        System.out.println("The dog is eating");
    }

    @Override
    public void play() {
        System.out.println("The dog is playing");
    }
}

public class Q3 {
    public static void main(String[] args) {
        Sol sol = new Sol(23,12);
        System.out.println(sol.sum(sol.x,sol.y));
    }
}
