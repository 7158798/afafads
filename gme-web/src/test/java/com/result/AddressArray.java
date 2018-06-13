package com.result;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class AddressArray implements Serializable {
    private static final long serialVersionUID = 1L;
    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    private List<Address> data;
    public AddressArray()
    {
        data= new ArrayList<>();
        for(int i=0;i<3;i++)
        {
            Address u1 = new Address();
            data.add(u1);
        }
    }

    public List<Address> getData() {
        return data;
    }

    public void setData(List<Address> data) {
        this.data = data;
    }
}
