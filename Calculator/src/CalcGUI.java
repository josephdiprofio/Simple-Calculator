import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.events.MouseAdapter;
import org.eclipse.swt.events.MouseEvent;


public class CalcGUI {

	protected Shell shell;
	private Text text;
	String currentText="";
	double num1, num2;
	String operator="";
	double currentTotal;
	private Text text2;
	CalcFunctions functions=new CalcFunctions();
	double total;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			CalcGUI window = new CalcGUI();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Open the window.
	 */
	public void open() {
		Display display = Display.getDefault();
		createContents();
		shell.open();
		shell.layout();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shell = new Shell();
		shell.setSize(350, 500);
		shell.setText("Calculator App");
	
		
		
		Button button = new Button(shell, SWT.NONE);
		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDown(MouseEvent e) {
				text.setText(text.getText()+0);
				currentText=text.getText();
			}
		});
		button.setBounds(10, 98, 63, 47);
		button.setText("0");
		
		Button button1 = new Button(shell, SWT.NONE);
		button1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDown(MouseEvent e) {
				text.setText(text.getText()+1);
				currentText=text.getText();
			}
		});
		button1.setText("1");
		button1.setBounds(79, 98, 63, 47);
		
		Button button2 = new Button(shell, SWT.NONE);
		button2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDown(MouseEvent e) {
				text.setText(text.getText()+2);
				currentText=text.getText();
			}
		});
		button2.setText("2");
		button2.setBounds(148, 98, 63, 47);
		
		Button button3 = new Button(shell, SWT.NONE);
		button3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDown(MouseEvent e) {
				text.setText(text.getText()+3);
				currentText=text.getText();
			}
		});
		button3.setText("3");
		button3.setBounds(10, 168, 63, 47);
		
		Button button4 = new Button(shell, SWT.NONE);
		button4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDown(MouseEvent e) {
				text.setText(text.getText()+4);
				currentText=text.getText();
			}
		});
		button4.setText("4");
		button4.setBounds(79, 168, 63, 47);
		
		Button button5 = new Button(shell, SWT.NONE);
		button5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDown(MouseEvent e) {
				text.setText(text.getText()+5);
				currentText=text.getText();
			}
		});
		button5.setText("5");
		button5.setBounds(148, 168, 63, 47);
		
		Button button6 = new Button(shell, SWT.NONE);
		button6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDown(MouseEvent e) {
				text.setText(text.getText()+6);
				currentText=text.getText();
			}
		});
		button6.setText("6");
		button6.setBounds(10, 236, 63, 47);
		
		Button button7 = new Button(shell, SWT.NONE);
		button7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDown(MouseEvent e) {
				text.setText(text.getText()+7);
				currentText=text.getText();
			}
		});
		button7.setText("7");
		button7.setBounds(79, 236, 63, 47);
		
		Button button8 = new Button(shell, SWT.NONE);
		button8.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDown(MouseEvent e) {
				text.setText(text.getText()+8);
				currentText=text.getText();
			}
		});
		button8.setText("8");
		button8.setBounds(148, 236, 63, 47);
		
		Button button9 = new Button(shell, SWT.NONE);
		button9.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDown(MouseEvent e) {
				text.setText(text.getText()+9);
				currentText=text.getText();
			}
		});
		button9.setText("9");
		button9.setBounds(10, 305, 63, 47);
		
		Button buttonDecimal = new Button(shell, SWT.NONE);
		buttonDecimal.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDown(MouseEvent e) {
				text.setText(text.getText()+".");
				currentText=text.getText();
			}
		});
		buttonDecimal.setText(".");
		buttonDecimal.setBounds(79, 305, 63, 47);
		
		Button buttonAdd = new Button(shell, SWT.NONE);
		buttonAdd.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDown(MouseEvent e) {
				
				num1=Double.parseDouble(currentText);
				text2.setText(currentText);
				operator="add";
				text.setText("");
				
			}
		});
		buttonAdd.setText("+");
		buttonAdd.setBounds(255, 98, 63, 47);
		
		Button buttonSubtract = new Button(shell, SWT.NONE);
		buttonSubtract.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDown(MouseEvent e) {
				num1=Double.parseDouble(currentText);
				text2.setText(currentText);
				operator="sub";
				text.setText("");
			}
		});
		buttonSubtract.setText("-");
		buttonSubtract.setBounds(255, 168, 63, 47);
		
		Button buttonMultiply = new Button(shell, SWT.NONE);
		buttonMultiply.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDown(MouseEvent e) {
				num1=Double.parseDouble(currentText);
				text2.setText(currentText);
				operator="mult";
				text.setText("");
			}
		});
		buttonMultiply.setText("x");
		buttonMultiply.setBounds(255, 236, 63, 47);
		
		Button buttonDivide = new Button(shell, SWT.NONE);
		buttonDivide.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDown(MouseEvent e) {
				num1=Double.parseDouble(currentText);
				text2.setText(currentText);
				operator="div";
				text.setText("");
			}
		});
		buttonDivide.setText("/");
		buttonDivide.setBounds(255, 305, 63, 47);
		
		Button buttonEquals = new Button(shell, SWT.NONE);
		buttonEquals.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDown(MouseEvent e) {
				num2=Double.parseDouble(currentText);
				
				if (operator.equals("add")) {
					total=functions.add(num1, num2);
					text2.setText(String.valueOf(total));
					text.setText("");
					currentText=String.valueOf(total);
					
				}
				else if (operator.equals("sub")) {
					total=functions.subtract(num1, num2);
					text2.setText(String.valueOf(functions.subtract(num1, num2)));
					text.setText("");
					currentText=String.valueOf(total);
				}
				else if (operator.equals("mult")) {
					total=functions.multiply(num1, num2);
					text2.setText(String.valueOf(functions.multiply(num1, num2)));
					text.setText("");
					currentText=String.valueOf(total);
				}
				else if (operator.equals("div")) {
					total=functions.divide(num1, num2);
					text2.setText(String.valueOf(functions.divide(num1, num2)));
					text.setText("");
					currentText=String.valueOf(total);
				}
			}
		});
		buttonEquals.setText("=");
		buttonEquals.setBounds(148, 305, 63, 47);
		
		Button buttonNegative = new Button(shell, SWT.NONE);
		buttonNegative.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDown(MouseEvent e) {
				text.setText("-"+text.getText());
				currentText=text.getText();
			}
		});
		buttonNegative.setText("+/-");
		buttonNegative.setBounds(10, 372, 63, 47);
		
		Button buttonClear = new Button(shell, SWT.NONE);
		buttonClear.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDown(MouseEvent e) {
				text.setText("");
				text2.setText("");
			}
		});
		buttonClear.setText("C");
		buttonClear.setBounds(255, 372, 63, 47);
		
		text = new Text(shell, SWT.BORDER);
		text.setBounds(10, 31, 205, 47);
		
		text2 = new Text(shell, SWT.BORDER);
		text2.setBounds(222, 31, 96, 47);
		
		
		
		
		
	}
	
	
	
}
