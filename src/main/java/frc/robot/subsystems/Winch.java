package frc.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;

import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;

/**
 * An example subsystem.  You can replace me with your own Subsystem.
 */
public class Winch extends Subsystem {
  // We have 4 Talon SRX motors (using CAN, NOT PWM), so we need to use VictorSRX
  // From Phoenix 3rd party software
  WPI_VictorSPX m_Winch = new WPI_VictorSPX(1);

  @Override
  public void initDefaultCommand() {
    m_Winch.configFactoryDefault();
  }

  public void up() {
    m_Winch.set(-0.5);
  }

  public void down() {
    m_Winch.set(0.3);
  }

  public void stop() {
    m_Winch.set(0.0);
  }
}