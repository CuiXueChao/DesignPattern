package prototypePattern;

import java.io.*;

/**
 * 原型对象 - 该对象属性中有引用对象。
 *
 * @ClassName: Treasure
 * @DESCRIPTION: 当原型对象中含有引用类型的对象时（非immutable的对象），需做额外的替换。复制的对象应与原型对象保持各自独立---深拷贝。在引用对象中也实现clone方法，并在最上层clone
 * 方法中进行替换，来达到深拷贝。
 * @author: cxc
 * @date: 2021/4/1
 */

public class TreasurePlus implements Cloneable, Serializable {
    private static final long serialVersionUID = 42L;
    /**
     * 国宝的名字
     */
    private String treasureName;
    /**
     * 国宝的尺寸
     */
    private String treasureSize;

    /**
     * 国宝的身份证
     */
    private TreasureCard treasureCard;


    /**
     * 需将引用对象的clone方法做实现，在此方法中进行克隆和替换的操作
     *
     * @Param:
     * @Description:
     * @Return: prototypePattern.TreasurePlus
     * @author: cxc
     * @date: 2021/4/1
     */
    @Override
    protected TreasurePlus clone() throws CloneNotSupportedException {
       /* TreasurePlus clone = (TreasurePlus) super.clone();
        //this.treasureCard.clone()= clone.getTreasureCard().clone();引用对象重写了clone方法后，在此进行克隆并替换。
        TreasureCard clone1 = clone.getTreasureCard().clone();
        clone.setTreasureCard(clone1);*/

        /*---------------------------V2---------------------------------*/
        //利用序列化的机制实现深拷贝
        //将该对象的实例写入流
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream)) {
            objectOutputStream.writeObject(this);
        } catch (IOException e) {
            e.printStackTrace();
        }
        //读取
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
        try (ObjectInputStream ois = new ObjectInputStream(byteArrayInputStream)) {
            TreasurePlus treasurePlus = (TreasurePlus) ois.readObject();
            return treasurePlus;
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        //return clone;
        return null;
    }

    public String getTreasureName() {
        return treasureName;
    }

    public void setTreasureName(String treasureName) {
        this.treasureName = treasureName;
    }

    public String getTreasureSize() {
        return treasureSize;
    }

    public void setTreasureSize(String treasureSize) {
        this.treasureSize = treasureSize;
    }

    public TreasureCard getTreasureCard() {
        return treasureCard;
    }

    public void setTreasureCard(TreasureCard treasureCard) {
        this.treasureCard = treasureCard;
    }

    @Override
    public String toString() {
        return this.hashCode() + "-----TreasurePlus{" +
                "treasureName='" + treasureName + '\'' +
                ", treasureSize='" + treasureSize + '\'' +
                ", treasureCard=" + treasureCard +
                '}';
    }

    public TreasurePlus() {
    }

    public TreasurePlus(String treasureName, String treasureSize, TreasureCard treasureCard) {
        this.treasureName = treasureName;
        this.treasureSize = treasureSize;
        this.treasureCard = treasureCard;
    }
}
