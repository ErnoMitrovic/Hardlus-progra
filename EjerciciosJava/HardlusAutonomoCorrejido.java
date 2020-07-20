package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.util.ElapsedTime;
import com.qualcomm.robotcore.util.Range;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Servo;

@Autonomous(name="Autonomo", group="Linear Opmode")
public class HardlusAutonomoCorrejido extends LinearOpMode {
  // Declare OpMode members.
  private ElapsedTime runtime = new ElapsedTime();
  private DcMotor leftDrive = null;
  private DcMotor rightDrive = null;
  private DcMotor lanzador = null;
  private DcMotor elevador = null;
  private DcMotor elevadorGrande = null;
  private Servo servo1 = null;
  private Servo servo2 = null;
  private Servo catapulta = null;


    @Override
    public void runOpMode() {
      telemetry.addData("Status", "Initialized");
      telemetry.update();

      leftDrive  = hardwareMap.get(DcMotor.class, "left_drive");
      rightDrive = hardwareMap.get(DcMotor.class, "right_drive");
      elevador = hardwareMap.get(DcMotor.class, "elevador");
      elevadorGrande = hardwareMap.get(DcMotor.class, "elevador1");
      lanzador = hardwareMap.get(DcMotor.class, "lanzador");
      servo1 = hardwareMap.get(Servo.class,"servo1" );
      servo2 = hardwareMap.get(Servo.class,"servo2" );
      catapulta = hardwareMap.get(Servo.class, "catapulta");

      condicionesIniciales();
      waitForStart();
      runtime.reset();
        //Creo que en la mayoría de casos, el currentTime se puede sustituir por sleep()
      double currentTime;
      if (opModeIsActive){
        // run until the end of the match (driver presses STOP
        while (opModeIsActive() && elevadorGrande.isBusy()) {
            elevadorGrande.setPower(0.5);
            telemetry.addData("Status", "Run Time: " + runtime.toString());
            telemetry.addData("Elevador: ", elevadorGrande.getCurrentPosition());
            telemetry.update();
        }
        sleep(1000);
        frenar();
        girar(130);
        sleep(1000);
        frenar();
        movimientoRecto(130);
        sleep(1000);
        frenar();
        girarIzquierda(130);
        sleep(1000);
        frenar();
        movimientoRecto((int)Math.round(288*5));
        sleep(1000);
        //Frenar no estaba en el programa original
        frenar();
        
        catapulta.setPosition(0.3);
      }
    }

    public void condicionesIniciales(){
      leftDrive.setDirection(DcMotor.Direction.FORWARD);
      rightDrive.setDirection(DcMotor.Direction.REVERSE);
      servo1.setPosition(0);
      servo2.setPosition(1);
      elevadorGrande.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
      elevadorGrande.setTargetPosition(-2120);
      elevadorGrande.setMode(DcMotor.RunMode.RUN_TO_POSITION);
      catapulta.setPosition(0.5);
    }

    public void driveResetEncoders(){
      leftDrive.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
      rightDrive.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
    }

    public void movimientoRecto(int distancia){
      double delante = 1;
      double atras = -1;
      leftDrive.setTargetPosition(distancia);
      rightDrive.setTargetPosition(distancia);
      leftDrive.setMode(DcMotor.RunMode.RUN_TO_POSITION);
      rightDrive.setMode(DcMotor.RunMode.RUN_TO_POSITION);
      if (distancia < 0) {
        leftDrive.setPower(atras);
        rightDrive.setPower(atras);
      }else if (distancia > 0){
        leftDrive.setPower(delante);
        rightDrive.setPower(delante);
      }
    }

    public void frenar(){
      leftDrive.setPower(0);
      rightDrive.setPower(0);
      driveResetEncoders();
    }

    public void girarIzquierda(int d){
      double potencia = 1;
      leftDrive.setTargetPosition(d);
      rightDrive.setTargetPosition(-d);
      leftDrive.setMode(DcMotor.RunMode.RUN_TO_POSITION);
      rightDrive.setMode(DcMotor.RunMode.RUN_TO_POSITION);
      leftDrive.setPower(potencia);
      rightDrive.setPower(potencia);
    }
}
