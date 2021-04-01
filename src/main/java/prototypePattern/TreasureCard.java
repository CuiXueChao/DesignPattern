package prototypePattern;

import java.io.Serializable;

/**
 * TreasurePlus类所引用的对象
 * @ClassName:TreasureCard
 * @DESCRIPTION:
 * @author: cxc
 * @DATE: 2021/4/1
 */

public class TreasureCard implements Cloneable, Serializable {
    private static final long serialVersionUID = 42L;
    /**
     * 国宝的身份证
     */
    private int cardId;

    //...其他的字段


    @Override
    protected TreasureCard clone() throws CloneNotSupportedException {
        return ((TreasureCard) super.clone());
    }

    @Override
    public String toString() {
        return this.hashCode()+"-----TreasureCard{" +
                "cardId=" + cardId +
                '}';
    }

    public int getCardId() {
        return cardId;
    }

    public void setCardId(int cardId) {
        this.cardId = cardId;
    }

    public TreasureCard() {
    }

    public TreasureCard(int cardId) {
        this.cardId = cardId;
    }
}
