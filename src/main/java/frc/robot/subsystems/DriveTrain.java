package frc.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

public class DriveTrain extends Subsystem {

    // We have 4 Talon SRX motors (using CAN, NOT PWM), so we need to use TalonSRX
    // From Phoenix 3rd party software
    WPI_TalonSRX m_rearRight = new WPI_TalonSRX(3);
    WPI_TalonSRX m_frontRight = new WPI_TalonSRX(1);
    SpeedControllerGroup m_right = new SpeedControllerGroup(m_frontRight, m_rearRight);

    WPI_TalonSRX m_rearLeft = new WPI_TalonSRX(4);
    WPI_TalonSRX m_frontLeft = new WPI_TalonSRX(2);
    SpeedControllerGroup m_left = new SpeedControllerGroup(m_frontLeft, m_rearLeft);

    DifferentialDrive m_drive = new DifferentialDrive(m_left, m_right);

    @Override
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        // setDefaultCommand(new MySpecialCommand());
        m_frontLeft.configFactoryDefault();
        m_frontRight.configFactoryDefault();
        m_rearLeft.configFactoryDefault();
        m_rearRight.configFactoryDefault();
    }

    public void driveWithJoystick(Joystick joystick) {
        m_drive.arcadeDrive(-joystick.getY(), joystick.getTwist() * 0.75);
    }

    public static void drive(double d, double e) {
        // TODO Auto-generated method stub

    }
}
