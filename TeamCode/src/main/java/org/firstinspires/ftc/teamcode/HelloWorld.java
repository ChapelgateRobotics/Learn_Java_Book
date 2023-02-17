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
//this sets the opMode in the Driver Station
@TeleOp
//@Autonomous
public class HelloWorld extends OpMode
{

    @Override
    public void init()
    {
        int grade = 47;
        String myName = " Kirk Frankfurth";
        int teamNumber = 5233;
        double motorSpeed = 0.05;
        boolean touchSensorPressed = false;
        telemetry.addData("Hello, World", myName, grade);
        telemetry.addData("Team Number: ", teamNumber);
        telemetry.addData("Motor Speed: ", motorSpeed);
        telemetry.addData("Touch Sensor Pressed? ", touchSensorPressed);
        int x = 5;
        {
            // X and Y can only be seen in this section of the scope
            int y = 4;
            telemetry.addData("Y", y);
            telemetry.addData("Total: ", x + y);
        }
        // X can only be seen in here
        telemetry.addData("X", x);
    }

    @Override
    public void loop()
    {


    }
}
