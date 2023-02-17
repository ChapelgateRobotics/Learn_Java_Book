package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

/**
 * Created byhomefrankfurth on 2/8/23 in FTC-master Learn Java.
 * <p>
 * Copyright (c) ©2023 Kirk Frankfurth
 * Copyright (c) ©2023 Mentor of Team VECTOR (5233) Kirk
 * Resource: https:/gitlab.com/robotics/ftc_app
 * Contact: kfrankfurth@chapelgateacademy.org, vector5233@gmail.com
 */
@TeleOp
public class Ex_4_6_CrazyMode extends OpMode
{
    @Override
    public void init()
    {

    }

    @Override
    public void loop()
    {
        double yspeed = gamepad1.left_stick_y;
        double xspeed = gamepad1.left_stick_x;

        if (gamepad1.a)
        {// crazy mode
            yspeed = gamepad1.left_stick_x;
            xspeed = gamepad1.left_stick_y;
        }
        telemetry.addData("Xspeed", xspeed);
        telemetry.addData("YSpeed", yspeed);
    }

}
