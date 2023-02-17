package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

/**
 * Created byhomefrankfurth on 3/7/22 in FTC-Freight Frenzy.
 * <p>
 * Copyright (c) ©2022 Kirk Frankfurth
 * Copyright (c) ©2022 Mentor of Team VECTOR (5233) Kirk
 * Resource: https:/gitlab.com/robotics/ftc_app
 * Contact: kfrankfurth@chapelgateacademy.org, vector5233@gmail.com
 */
@TeleOp
public class GamePadOpMod extends OpMode{
        @Override

        public void  init(){


        }
        @Override
        public void loop(){
            telemetry.addData("Left stick x",gamepad1.left_stick_x);
            telemetry.addData("Left stick y", gamepad1.left_stick_y);
            telemetry.addData("A button", gamepad1.a);
        }
}
