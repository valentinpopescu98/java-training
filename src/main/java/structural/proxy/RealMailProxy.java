package structural.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class RealMailProxy implements InvocationHandler {
    private Object object;

    public RealMailProxy(Object object) {
        this.object = object;
    }

    public static Object newInstance(Object object) {
        return Proxy.newProxyInstance(object.getClass().getClassLoader(),
                object.getClass().getInterfaces(), new RealMailProxy(object));
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("Filtering and other stuff...");

        return method.invoke(this.object, args);
    }
}
