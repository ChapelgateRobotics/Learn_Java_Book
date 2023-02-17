package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

/**
* Created byhomefrankfurth on 2/8/23 in FTC-master Learn Java.
*
* Copyright (c) ©2023 Kirk Frankfurth
* Copyright (c) ©2023 Mentor of Team VECTOR (5233) Kirk
* Resource: https:/gitlab.com/robotics/ftc_app
* Contact: kfrankfurth@chapelgateacademy.org, vector5233@gmail.com
*/
@TeleOp
public class Ex4_6_Turbo_button extends OpMode
{
    @Override
    public void init(){

    }
    @Override
    public void loop(){
        double fwdSpeed = gamepad1.right_stick_y;

        if (!gamepad1.a){
            fwdSpeed *= 0.5;
        }
        telemetry.addData("Forward Speed",fwdSpeed);
    }
}
