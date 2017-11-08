package org.neo.contractsample.helloworld;

import org.neo.smartcontract.framework.SmartContract;
import org.neo.smartcontract.framework.services.neo.Storage;

/**
 * Created by zlh on 09/11/2017.
 */
public class HelloWorld extends SmartContract {

    public static void Main(String[] args) {
        Storage.put(Storage.currentContext(), "Hello", "World");
    }

}
