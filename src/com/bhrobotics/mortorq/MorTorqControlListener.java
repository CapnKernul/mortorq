package com.bhrobotics.mortorq;

import com.bhrobotics.morlib.Listener;
import com.bhrobotics.morlib.Reactor;
import com.bhrobotics.morlib.ControlListener;
import com.bhrobotics.morlib.TimeoutEmitter;
import edu.wpi.first.wpilibj.DigitalInput;

class MorTorqControlListener extends ControlListener {
    // private TimeoutEmitter endGameTimeout             = new TimeoutEmitter();
    private MorTorqTouchPanelFilter panelFilter       = new MorTorqTouchPanelFilter();
    // private MecanumDriveListener mecanumDriveListener = new MecanumDriveListener();
    // private MastListener mastListener                 = new MastListener();
    // private MinibotListener minibotListener           = new MinibotListener();
    // private ElbowListener elbowListener               = new ElbowListener();
    // private ClawListener clawListener                 = new ClawListener();
    // private WristListener wristListener               = new WristListener();
    private CompressorListener compressorListener     = new CompressorListener();
    
    public void startAutonomous() {
        // mecanumDriveListener.stop();
        // mastListener.stop();
        // minibotListener.reset();
        // elbowListener.reset();
        // clawListener.reset();
        // wristListener.reset();
        // compressorListener.auto();
    }
    
    public void stopAutonomous() {
        // mecanumDriveListener.stop();
        // mastListener.stop();
    }
    
    public void startOperatorControl() {
        compressorListener.auto();
        // joystickFilter.bind("updateJoystick1", mecanumDriveListener);
        dsInputFilter.bind("all", panelFilter);
        
        // endGameTimeout.bind("startEndGame", minibotListener);
        // endGameTimeout.schedule("startEndGame", 110);
        
        // panelFilter.bind("all", mecanumDriveListener);
        // panelFilter.bind("all", mastListener);
        // panelFilter.bind("all", minibotListener);
        // panelFilter.bind("all", elbowListener);
        // panelFilter.bind("all", clawListener);
        // panelFilter.bind("all", wristListener);
        // panelFilter.bind("all", compressorListener);
    }
    
    public void stopOperatorControl() {
        // joystickFilter.unbind("updateJoystick1", mecanumDriveListener);
        dsInputFilter.unbind("all", panelFilter);
        
        // endGameTimeout.unbind("startEndGame", minibotListener);
        // endGameTimeout.cancelAll();
        
        // panelFilter.unbind("all", mecanumDriveListener);
        // panelFilter.unbind("all", mastListener);
        // panelFilter.unbind("all", minibotListener);
        // panelFilter.unbind("all", elbowListener);
        // panelFilter.unbind("all", clawListener);
        // panelFilter.unbind("all", wristListener);
        // panelFilter.unbind("all", compressorListener);
    }
}