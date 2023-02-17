package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

/**
* Created byhomefrankfurth on 3/18/22 in FTC-Freight Frenzy.
*
* Copyright (c) ©2022 Kirk Frankfurth
* Copyright (c) ©2022 Mentor of Team VECTOR (5233) Kirk
* Resource: https:/gitlab.com/robotics/ftc_app
* Contact: kfrankfurth@chapelgateacademy.org, vector5233@gmail.com
*/
@TeleOp

public  class ClassMethodOpMode  extends OpMode
{   @Override
    public void init(){

    }
    double motor =0;
    double squareInputsWithSign(double input){
    double output = input * input;
        if(input < 0){
            output = output * -1;
    }
        return output;
    }
    void setMotorSpeed(double speed){
        //motor.set(speed);
    }
    //boolean isSensorPressed(){
    //return
        // TouchSensor.isSensorPressed();
    //}
    double min(double x, double y){
    if(x < y){
        return x;

    }
    return y;
    }

    @Override
    public  void loop(){
    double leftAmount = gamepad1.left_stick_x;
    double fwdAmount = -gamepad1.left_stick_y;

    telemetry.addData("Before X", leftAmount);
    telemetry.addData("Before Y", fwdAmount);

    leftAmount = squareInputsWithSign(leftAmount);
    fwdAmount = squareInputsWithSign(fwdAmount);

    telemetry.addData("Before X", leftAmount);
    telemetry.addData("Before Y", fwdAmount);

    }


}
