package com.concretepage;
import javax.faces.event.AbortProcessingException;
import javax.faces.event.ActionEvent;
import javax.faces.event.ActionListener;
public class SubmitActionListener implements ActionListener {
	@Override
	public void processAction(ActionEvent event)
			throws AbortProcessingException {
		System.out.println("Form Id by ActionListener class:"+event.getComponent().getParent().getId());
	}
}
