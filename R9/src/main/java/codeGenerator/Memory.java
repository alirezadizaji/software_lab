package codeGenerator;

import java.util.ArrayList;

/**
 * Created by mohammad hosein on 6/27/2015.
 */
public class Memory {
    private final ArrayList<My3AddressCode> codeBlock;
    private int lastTempIndex;
    private int lastDataAddress;
    final static int strAtTempMemoryAddress = 500;
    final static int strAtDataMemoryAddress = 200;
    final static int dataSize = 4;
    final static int tempSize = 4;

    public Memory() {
        codeBlock = new ArrayList<>();
        lastTempIndex = strAtTempMemoryAddress;
        lastDataAddress = strAtDataMemoryAddress;
    }

    public int getTemp() {
        lastTempIndex += tempSize;
        return lastTempIndex - tempSize;
    }
    public  int getDateAddress(){
        lastDataAddress += dataSize;
        return lastDataAddress- dataSize;
    }
    public int saveMemory() {
        codeBlock.add(new My3AddressCode());
        return codeBlock.size() - 1;
    }

    public void add3AddressCode(Operation op, Address opr1, Address opr2, Address opr3) {
        codeBlock.add(new My3AddressCode(op,opr1,opr2,opr3));
    }

    public void add3AddressCode(int i, Operation op, Address opr1, Address opr2, Address opr3) {
        codeBlock.remove(i);
        codeBlock.add(i, new My3AddressCode(op, opr1, opr2,opr3));
    }


    public int getCurrentCodeBlockAddress() {
        return codeBlock.size();
    }

    public void pintCodeBlock() {
        System.out.println("Code Block");
        for (int i = 0; i < codeBlock.size(); i++) {
            System.out.println(i + " : " + codeBlock.get(i).toString());
        }
    }
}

class My3AddressCode {
    public Operation operation;
    public Address Operand1;
    public Address Operand2;
    public Address Operand3;

    public My3AddressCode() {

    }

    public My3AddressCode(Operation op, Address opr1, Address opr2, Address opr3) {
        operation = op;
        Operand1 = opr1;
        Operand2 = opr2;
        Operand3 = opr3;
    }

    public String toString()
    {
        if(operation == null) return "";
        StringBuilder res = new StringBuilder("(");
        res.append(operation).append(",");
        if(Operand1 != null)
            res.append(Operand1);
        res.append(",");
        if(Operand2 != null)
            res.append(Operand2);
        res.append(",");
        if(Operand3 != null)
            res.append(Operand3);
        res.append(")");

        return res.toString();
    }
}
