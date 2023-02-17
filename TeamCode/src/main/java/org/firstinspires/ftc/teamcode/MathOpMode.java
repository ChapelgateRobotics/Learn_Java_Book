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
public class MathOpMode extends OpMode
{
    @Override
    public void init()
    {

    }

    @Override
    public void loop()
    {
        double speedForward = -gamepad1.left_stick_y / 2.0;
        telemetry.addData("Left Stick Y: ", gamepad1.left_stick_y);
        telemetry.addData("Speed Forward: ", speedForward);
        telemetry.addData("B button", gamepad1.b);

        double turnSpeed = gamepad1.right_stick_x / 2;
        telemetry.addData("Right Stick x: ", gamepad1.right_stick_x);
        telemetry.addData("Speed Forward: ", turnSpeed);
        telemetry.addData("Diff Left y and right y", gamepad1.left_stick_y - gamepad1.right_stick_y);
        telemetry.addData("Sum Triggers", gamepad1.right_trigger + gamepad1.left_trigger);
    }
}
