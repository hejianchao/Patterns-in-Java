###关于简单工厂方法的一点补充说明

在 JDK 中，java.text.DateFormat 类就使用了简单工厂方法：DateFormat.getDateInstance() instanceof SimpleDateFormat
将会返回 true.
这里实际查看 DateFormat.getDateInstance() 的方法会看到其内部实现是：return new SimpleDateFormat(...)。

与一般的简单工厂模式不同的是，上面这个例子 工厂角色 与 抽象产品角色 合并为一个类DateFormat，也就是抽象产品角色负责
了具体产品的创建，这也是简单工厂模式的一个特例。

由于使用了简单工厂模式，客户端完全不用关心工厂方法所返还的对象时怎么创建和构成的，工厂方法将实例化哪些对象和具体如
何实例化这些对象的细节隐藏起来，使得这些对象的使用简化起来。
