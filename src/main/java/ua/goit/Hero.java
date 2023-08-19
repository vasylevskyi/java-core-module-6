package ua.goit;

class Hero {
    private String name;
    private int hp;

    public Hero() {
        this("Paratrooper", 100);
    }

    public Hero(String name, int hp) {
        this.name = name;
        if (hp >= 0 && hp <= 200) {
            this.hp = hp;
        } else if (hp > 200) {
            this.hp = 200;
        } else {
            this.hp = 0;
        }
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

//      Task 2-3
        Hero hero = new Hero("Stranger", 250);

        //Expect Stranger
        System.out.println(hero.getName());

        //Expect 50
        System.out.println(hero.getHp());


    }
}

