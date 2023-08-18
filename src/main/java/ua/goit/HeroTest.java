package ua.goit;

class Hero {
    private String name;
    private int hp;

    public Hero() {
        name = "Paratrooper";
        hp = 100;
    }

    public Hero(String name, int hp) {
        this.name = name;
        this.hp = hp;
    }


    public String getName() {
        return name;
    }
    public int getHp() {
        return hp;
    }
}


class HeroTest {
    public static void main(String[] args) {
/*         Hero hero = new Hero();

        Task 1  //Expect Paratrooper
        System.out.println(hero.getName());

        //Expect 100
        System.out.println(hero.getHp());*/

        Hero hero = new Hero("Stranger", 50);

        //Expect Stranger
        System.out.println(hero.getName());

        //Expect 50
        System.out.println(hero.getHp());
    }
}

