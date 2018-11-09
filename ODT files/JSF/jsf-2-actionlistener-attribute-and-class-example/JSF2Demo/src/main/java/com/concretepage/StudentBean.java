package com.concretepage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.event.AbortProcessingException;
import javax.faces.event.ActionEvent;
@ManagedBean(name = "studentBean", eager = true)
@RequestScoped
public class StudentBean {
	public void performAction(ActionEvent event)
            throws AbortProcessingException {
        System.out.println("Form Id by ActionListener attribute:"+event.getComponent().getParent().getId());
    }
	public String submitActionForMethod()
            throws AbortProcessingException {
        System.out.println("Action Submitted for ActionListener attribute.");
        return "eventwithmethod";
    }
	public String submitActionForClass()
            throws AbortProcessingException {
        System.out.println("Action Submitted for ActionListener class.");
        return "eventwithclass";
    }
}