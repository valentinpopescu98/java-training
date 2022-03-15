package structural.composite.ex2.menus;

import java.util.ArrayList;
import java.util.List;

public abstract class MenuComponent {
    private final String name;
    private final String url;
    protected List<MenuComponent> menuComponents = new ArrayList<>();

    public MenuComponent(String name, String url) {
        this.name = name;
        this.url = url;
    }

    public String print(MenuComponent menuComponent) {
        StringBuilder builder = new StringBuilder(name);
        builder.append(": ");
        builder.append(url);
        builder.append("\n");

        return builder.toString();
    }

    public abstract String toString();
}
