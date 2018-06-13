package com.result;

import com.alibaba.fastjson.JSON;
import com.sun.corba.se.spi.orbutil.threadpool.Work;

import net.sf.json.util.JSONUtils;

import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String args[])
    {
      //  System.out.println(msg);
      //  System.out.println(getCoinInfo());
        //    System.out.println(getCoinInfoArray());
      // System.out.println(getKLineArray());
        // System.out.println(getTopCoinPrices());
        //  System.out.println(getPriceTiker());
     //   System.out.println(getRechareHistory());
     //   System.out.println(getRechareHistory2());
     // System.out.println(getAddressArray());
        //   System.out.println(getBalance());
        //          System.out.println(getTradeHistroy());
//        System.out.println(getOrderList());
        //      System.out.println(getAllOrderList());
//     System.out.println(getWorkLists());
    	System.out.println(getGCurrencyData());

    }
    
    
   /* public static String getWorkOrderArray()
    {
        WorkOrderArray w = new WorkOrderArray();
        return JSON.toJSONString(w);
    }
    
    public static String getReplayWorkOrder(){
    	ReplayWorkOrder r = new ReplayWorkOrder();
    	return JSON.toJSONString(r);
    }
    public static String getBankPayBind(){
    	BankPayBind b = new BankPayBind();
    	return JSON.toJSONString(b);
    }
    public static String getPhonePayBind(){
    	PhonePayBind p = new PhonePayBind();
    	return JSON.toJSONString(p);
    }
    public static String getCurrencyArray(){
    	CurrencyArray c = new CurrencyArray();
    	return JSON.toJSONString(c);
    }
    public static String getWalletArrayWalletArray(){
    	WalletArray w = new WalletArray();
    	return JSON.toJSONString(w);
    }
    public static String getEntryOrderArray(){
    	EntryOrderArray e = new EntryOrderArray();
    	return JSON.toJSONString(e);
    }
    public static String getEntryOrderRecordArray(){
    	EntryOrderRecordArray e = new EntryOrderRecordArray();
    	return JSON.toJSONString(e);
    }
    public static String getNoticeArray(){
    	NoticeArray n = new NoticeArray();
    	return JSON.toJSONString(n);
    }*/
    
    
    
    
    public static String getGCurrencyData(){
    	GCurrencyData g = new GCurrencyData();
    	return JSON.toJSONString(g);
    }
    
    
    
    
    
    
    
    
    /*public static String getCoinInfo()
    {
        CoinInfo u = new CoinInfo();
        return JsonUtils.objectToJson(u);
    }
    public static String getCoinInfoArray()
    {
        CoinInfoArray u= new CoinInfoArray();

        return JsonUtils.objectToJson(u);
    }
    public static String getKLineArray()
    {
        KLineArray u= new KLineArray();

        return JsonUtils.objectToJson(u);
    }

    public static String getTopCoinPrices()
    {
        TopCoinPriceB u= new TopCoinPriceB();

        return JsonUtils.objectToJson(u);
    }
    public static String getPriceTiker()
    {
        PriceTiker u= new PriceTiker();

        return JsonUtils.objectToJson(u);
    }
    public static String getRechareHistory()
    {
        RechareHistory u= new RechareHistory();

        return JsonUtils.objectToJson(u);
    }
    public static String getRechareHistory2()
    {
        RechareHistory2 u= new RechareHistory2();

        return JsonUtils.objectToJson(u);
    }*/
    public static String getAddressArray()
    {
        AddressArray u= new AddressArray();
        return JSON.toJSONString(u);
//        return JsonUtils.objectToJson(u);
    }
//    public static String getBalance()
//    {
//        Balance u= new Balance();
//
//        return JsonUtils.objectToJson(u);
//    }
//    public static String getTradeHistroy()
//    {
//        TradeHistroy u= new TradeHistroy();
//
//        return JsonUtils.objectToJson(u);
//    }
//
//    public static String getOrderList()
//    {
//        OrderList u= new OrderList();
//
//        return JsonUtils.objectToJson(u);
//    }
//
//    public static String getAllOrderList()
//    {
//        AllOrderList u= new AllOrderList();
//
//        return JsonUtils.objectToJson(u);
//    }
//    public static String getWorkLists()
//    {
//        WorkLists u= new WorkLists();
//
//        return JsonUtils.objectToJson(u);
//    }
//    public static String getUserIdentify()
//    {
//        UserIdentify u= new UserIdentify();
//
//        return JsonUtils.objectToJson(u);
//    }


}
