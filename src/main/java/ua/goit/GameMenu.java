package ua.goit;

/**
 * Task 20
 */

public class GameMenu {

    static abstract class MenuItem {
        public abstract String getAction();
    }
    static class Start extends MenuItem {
        @Override
        public String getAction() {
            return "start";
        }
    }
    static class Options extends MenuItem {
        @Override
        public String getAction() {
            return "options";
        }
    }
    static class Exit extends MenuItem {
        @Override
        public String getAction() {
            return "exit";
        }
    }
    public void act(MenuItem item) {
        System.out.println(item.getAction());
    }

}

class GameMenuTest {
    public static void main(String[] args) {
        GameMenu menu = new GameMenu();

        //options
        menu.act(new GameMenu.Options());

        //start
        menu.act(new GameMenu.Start());

        //exit
        menu.act(new GameMenu.Exit());
    }
}
