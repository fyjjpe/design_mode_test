package m04_Prototype.demo2;

/**
 * Created by yuanjie.fang on 2018/1/22.
 * 抽象原型
 */
public interface Prototype {
    public Prototype clone();

    public String getName();

    public void setName(String name);
}
