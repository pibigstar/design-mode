# java23种设计模式

### 单例模式
>  单例模式，是一种常用的软件设计模式。在它的核心结构中只包含一个被称为单例的特殊类。通过单例模式可以保证系统中一个类只有一个实例。即一个类只有一个对象实例。

### 工厂模式
> 工厂模式是 Java 中最常用的设计模式之一。这种类型的设计模式属于创建型模式，它提供了一种创建对象的最佳方式。工厂模式主要是为创建对象提供过渡接口，以便将创建对象的具体过程屏蔽隔离起来，达到提高灵活性的目的。

### 原型模式
>  通过复制现有的对象实例来创建新的对象实例。

### 代理模式
>  为其他对象提供一种代理以控制对这个对象的访问。在某些情况下，一个对象不适合或者不能直接引用另一个对象，而代理对象可以在客户端和目标对象之间起到中介的作用

### 生成器模式
> 将一个复杂对象的构建与它的表示分离，使得同样的构建过程可以创建不同的表示。生成器模式利用一个导演者对象和具体建造者对象一个一个地建造出所有的零件，从而建造出完整的对象。

### 适配器模式
>将一个类的接口转换成客户希望的另外一个接口。适配器模式使得原本由于接口不兼容而不能一起工作的那些类可以一起工作。

### 装饰者模式
> 在不必改变原类文件和原类使用的继承的情况下，动态地扩展一个对象的功能。
> 它是通过创建一个包装对象，也就是用装饰来包裹真实的对象来实现。

### 模板模式
> 定义一个操作中算法的框架，而将一些步骤延迟到子类中，使得子类可以不改变算法的结构即可重定义该算法中的某些特定步骤。

### 外观模式
> 为子系统中的一组接口提供一个一致的界面，Facade模式定义了一个高层接口，这个接口使得这一子系统更加容易使用。

### 桥接模式
> 桥接模式 (Bridge)将抽象部分与实现部分分离，使它们都可以独立的变化。
桥接模式是一种结构式模式。

### 组合模式
> 组合模式（Composite Pattern），又叫部分整体模式，是用于把一组相似的对象当作一个单一的对象。组合模式依据树形结构来组合对象，用来表示部分以及整体层次。这种类型的设计模式属于结构型模式，它创建了对象组的树形结构。
这种模式创建了一个包含自己对象组的类。该类提供了修改相同对象组的方式。

### 策略模式
>  策略模式是对算法的封装，把一系列的算法分别封装到对应的类中，并且这些类实现相同的接口，相互之间可以替换。在前面说过的行为类模式中，有一种模式也是关注对算法的封装——模版方法模式。

### 观察者模式
> 定义对象间一种一对多的依赖关系，使得当每一个对象改变状态，则所有依赖于它的对象都会得到通知并自动更新。

### 迭代器模式
> 提供一种方法访问一个容器对象中各个元素，而又不暴露该对象的内部细节。

### 解释器模式
> 给定一种语言，定义他的文法的一种表示，并定义一个解释器，该解释器使用该表示来解释语言中句子。

### 访问者模式
> 封装某些作用于某种数据结构中各元素的操作，它可以在不改变数据结构的前提下定义作用于这些元素的新的操作。

### 命令模式
>将一个请求封装成一个对象，从而让你使用不同的请求把客户端参数化，对请求排队或者记录请求日志，可以提供命令的撤销和恢复功能。

### 备忘录模式
>在不破坏封装性的前提下，捕获一个对象的内部状态，并在该对象之外保存这个状态。这样就可以将该对象恢复到原先保存的状态。

### 责任链模式
>使多个对象都有机会处理请求，从而避免了请求的发送者和接收者之间的耦合关系。将这些对象连成一条链，并沿着这条链传递该请求，直到有对象处理它为止。