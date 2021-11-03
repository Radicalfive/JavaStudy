package com.radical.netty.demo.domain;

/**
 * @description: 文件传输协议
 * @author: radical
 * @date: 2021-11-02
 **/
public class FileTransferProtocol {

    /**
     * 0请求传输文件、1文件传输指令、2文件传输数据
     */
    private Integer transferType;
    /**
     * 数据对象 (0)FileDescInfo、(1)FileBurstInstruct、(2)FileBurstData±
     */
    private Object transferObj;

    public Integer getTransferType() {
        return transferType;
    }

    public void setTransferType(Integer transferType) {
        this.transferType = transferType;
    }

    public Object getTransferObj() {
        return transferObj;
    }

    public void setTransferObj(Object transferObj) {
        this.transferObj = transferObj;
    }

}

