package com.radical.chatui.view.face;

/**
 * @description: 定义表情框隐藏事件
 * @author: radical
 * @date: 2021/10/25
 */
public class FaceEventDefine {

    private  FaceInit faceInit;

    public FaceEventDefine(FaceInit faceInit) {
        this.faceInit = faceInit;
        hideFace();
    }

    private void hideFace() {
        faceInit.root().setOnMouseExited(event -> faceInit.hide());
    }
}