package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

/**
* Created byhomefrankfurth on 3/8/22 in FTC-Freight Frenzy.
*
* Copyright (c) ©2022 Kirk Frankfurth
* Copyright (c) ©2022 Mentor of Team VECTOR (5233) Kirk
* Resource: https:/gitlab.com/robotics/ftc_app
* Contact: kfrankfurth@chapelgateacademy.org, vector5233@gmail.com
*/
@TeleOp
public class IfElseOpMode  extends OpMode
{
    @Override
    public void init(){

    }
    @Override
    public void loop(){
        if (gamepad1.left_stick_y<0){
            telemetry.addData("Left Stick", " is negative");
        }else{
            telemetry.addData("Left stick"," is positive");
        }
            telemetry.addData("Left stick y",gamepad1.left_stick_y);
    }

}
