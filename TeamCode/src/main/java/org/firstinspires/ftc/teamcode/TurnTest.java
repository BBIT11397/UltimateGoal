package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.util.ElapsedTime;

import org.firstinspires.ftc.robotcore.external.ClassFactory;
import org.firstinspires.ftc.robotcore.external.matrices.OpenGLMatrix;
import org.firstinspires.ftc.robotcore.external.navigation.Orientation;
import org.firstinspires.ftc.robotcore.external.navigation.VuforiaLocalizer;
import org.firstinspires.ftc.robotcore.external.navigation.VuforiaTrackable;
import org.firstinspires.ftc.robotcore.external.navigation.VuforiaTrackableDefaultListener;
import org.firstinspires.ftc.robotcore.external.navigation.VuforiaTrackables;

import static org.firstinspires.ftc.robotcore.external.navigation.AngleUnit.DEGREES;
import static org.firstinspires.ftc.robotcore.external.navigation.AxesOrder.XYZ;
import static org.firstinspires.ftc.robotcore.external.navigation.AxesReference.EXTRINSIC;
import static org.firstinspires.ftc.robotcore.external.navigation.VuforiaLocalizer.CameraDirection.FRONT;


@Disabled
    @Autonomous(name="TurnTest", group="bbit")
    public class TurnTest extends LinearOpMode {
        /* Declare OpMode members. */
        Hardware robot = new Hardware();
        private ElapsedTime runtime = new ElapsedTime();
        private static final String VUFORIA_KEY = "AR6vl4b/////AAABmZgsD/qFKU5ckqZbY3OoUJIcRxE+StRnHOz7Rbpuii+XYylNWzTn29Q/ZbmfRiIJb5Oy4w65MdCo7yrGyOdpKQqCvBfoEZ4ykwXruAnjmW+rXCoatYZ+L1393f/YFuplJUKjbWUbLj45ygMcCPEZ8DNB9JnOZeZxiLygd6k6VVB8YVGHMReVj9vRYJyJj8UV+xknITZGgZ6QPC4IBI/Gh3uWHen96+cH28fJPsyVss1jcdNGCZKunj6io8oWmA6katkVdHfNyH/YWOHOIhkMP1LdUeL2WlbFa0nRbEIvDSVfCXAo5IdnXD8HsESVlZPpKdQzrUVuGo3kfd6ny5yHNCzQU4krKnuqNgwl0uEwpGdp";
        private VuforiaLocalizer vuforia;
        private static final VuforiaLocalizer.CameraDirection CAMERA_CHOICE = FRONT;
        private OpenGLMatrix lastLocation = null;
        private static final float mmPerInch = 25.4f;
        private static final float stoneZ = 2.00f * mmPerInch;
        private String name;

        boolean isSkyStoneVisible = false;

        double power = 1;
        int finalPark = 900;
        int reverseFromBlocks = 250;
        int stonePosition = -1;
        double turnPower = 0.4;

        float yValue = 0;

        @Override
        public void runOpMode() {
            robot.init(hardwareMap, telemetry);

            waitForStart();

            robot.setUpMotors();
            robot.turnLeft(1850, turnPower);
            while (robot.checkMotorIsBusy() && opModeIsActive()) {
                telemetry.addLine()
                        .addData("Task", "reline");
                idle();
            }
            robot.allMotorsStop();

        }
    }
