package structural.composite.ex2.menus;

public class Menu extends MenuComponent {
    public Menu(String name, String url) {
        super(name, url);
    }

    public MenuComponent add(MenuComponent menuComponent) {
        menuComponents.add(menuComponent);
        return menuComponent;
    }

    public MenuComponent remove(MenuComponent menuComponent) {
        menuComponents.remove(menuComponent);
        return menuComponent;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(print(this));

        for (MenuComponent menuComponent : menuComponents) {
            stringBuilder.append(menuComponent.toString());
        }

        return stringBuilder.toString();
    }
}
