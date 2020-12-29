package com.spring5.ioc;

/**
 * @author lijichen
 * @date 2020/11/14 - 15:30
 */
public class Orders {
    private int oid;
    private String oname;
    private String oaddress;
    private String desc;

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Override
    public String toString() {
        return "Orders{" +
                "oid=" + oid +
                ", oname='" + oname + '\'' +
                ", oaddress='" + oaddress + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }

    public String getOaddress() {
        return oaddress;
    }

    public void setOaddress(String oaddress) {
        this.oaddress = oaddress;
    }

    public Orders() {
    }

    public Orders(int oid, String oname) {
        this.oid = oid;
        this.oname = oname;
    }

    public int getOid() {
        return oid;
    }

    public void setOid(int oid) {
        this.oid = oid;
    }

    public String getOname() {
        return oname;
    }

    public void setOname(String oname) {
        this.oname = oname;
    }

}
