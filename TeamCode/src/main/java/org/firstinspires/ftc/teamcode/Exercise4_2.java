package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;


/**
* Created byhomefrankfurth on 3/13/22 in FTC-Freight Frenzy.
*
* Copyright (c) ©2022 Kirk Frankfurth
* Copyright (c) ©2022 Mentor of Team VECTOR (5233) Kirk
* Resource: https:/gitlab.com/robotics/ftc_app
* Contact: kfrankfurth@chapelgateacademy.org, vector5233@gmail.com
*/

@TeleOp
public    class Exercise4_2 extends OpMode
{
    @Override
    public void init(){

    }
    @Override
    public  void loop(){
        double ySpeed = gamepad1.left_stick_y;
        double xSpeed = gamepad1.left_stick_x;

        if (gamepad1.a){
            ySpeed = gamepad1.left_stick_x;
            xSpeed = gamepad1.left_stick_y;
        }
        telemetry.addData("X Speed", xSpeed);
        telemetry.addData("Y Speed", ySpeed);

    }

}
