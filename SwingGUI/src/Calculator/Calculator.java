package Calculator;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.print.attribute.AttributeSet;
import javax.swing.AbstractButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.event.AncestorListener;
import javax.swing.text.AbstractDocument;
import javax.swing.text.BadLocationException;
import javax.swing.event.AncestorEvent;
import javax.swing.JTextArea;
import javax.swing.ImageIcon;
import javax.swing.text.DocumentFilter;

public class Calculator extends JFrame {

	String operandl = "";
	String operator = "";
	
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtResult;
	boolean isEqualsPress = false;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator frame = new Calculator();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Calculator() {
		setTitle("Calculator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 373);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton(".");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton.setBounds(31, 283, 89, 40);
		contentPane.add(btnNewButton);
		
		JButton btnNumber0 = new JButton("0");
		btnNumber0.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNumber0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (isEqualsPress) {
					isEqualsPress = false;
					txtResult.setText("");
				}
				String cmd = e.getActionCommand();
				txtResult.setText(txtResult.getText() + cmd);
			}
		});
		btnNumber0.setBounds(125, 283, 89, 40);
		contentPane.add(btnNumber0);
		
		JButton btnEquals = new JButton("=");
		btnEquals.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (txtResult.getText().equals("") || operandl.equals("")) {
					return;
				}
				try {
					double oprand1 = Double.parseDouble(operandl);
					double oprand2 = Double.parseDouble(txtResult.getText());
					double result = 0;
					if (operator.equals("+")) {
						result = oprand1 + oprand2;
					}else if (operator.equals("-")) {
						result = oprand1 - oprand2;
					}else if (operator.equals("*")) {
						result = oprand1 * oprand2;
					}else if (operator.equals("/")) {
						result = oprand1 / oprand2;
					}
					txtResult.setText("" + result);
					isEqualsPress = true;
				} catch(Exception e2) {}
			}
		});
		btnEquals.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnEquals.setForeground(new Color(0, 0, 0));
		btnEquals.setBackground(new Color(192, 192, 192));
		btnEquals.setBounds(219, 283, 89, 40);
		contentPane.add(btnEquals);
		
		JButton btnAdd = new JButton("+");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String cmd = e.getActionCommand();
				operator = cmd;
				operandl = txtResult.getText();
				txtResult.setText("");
			}
		});
		btnAdd.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnAdd.setBounds(313, 283, 89, 40);
		contentPane.add(btnAdd);
		
		JButton btnNumber1 = new JButton("1");
		btnNumber1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { 
				if (isEqualsPress) {
					isEqualsPress = false;
					txtResult.setText("");
				}
				String cmd = e.getActionCommand(); //phương thức xử lý sự kiện của button
				txtResult.setText(txtResult.getText() + cmd);
			}
		});
		btnNumber1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNumber1.setBounds(31, 232, 89, 40);
		contentPane.add(btnNumber1);
		
		JButton btnNumber2 = new JButton("2");
		btnNumber2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (isEqualsPress) {
					isEqualsPress = false;
					txtResult.setText("");
				}
				String cmd = e.getActionCommand();
				txtResult.setText(txtResult.getText() + cmd);
			}
		});
		btnNumber2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNumber2.setBounds(125, 232, 89, 40);
		contentPane.add(btnNumber2);
		
		JButton btnNumber3 = new JButton("3");
		btnNumber3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (isEqualsPress) {
					isEqualsPress = false;
					txtResult.setText("");
				}
				String cmd = e.getActionCommand();
				txtResult.setText(txtResult.getText() + cmd);
			}
		});
		btnNumber3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNumber3.setBounds(219, 232, 89, 40);
		contentPane.add(btnNumber3);
		
		JButton btnSuptract = new JButton("-");
		btnSuptract.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String cmd = e.getActionCommand();
				operator = cmd;
				operandl = txtResult.getText();
				txtResult.setText("");
			}
		});
		btnSuptract.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnSuptract.setBounds(313, 232, 89, 40);
		contentPane.add(btnSuptract);
		
		JButton btnNumber4 = new JButton("4");
		btnNumber4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (isEqualsPress) {
					isEqualsPress = false;
					txtResult.setText("");
				}
				String cmd = e.getActionCommand();
				txtResult.setText(txtResult.getText() + cmd);
			}
		});
		btnNumber4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNumber4.setBounds(31, 181, 89, 40);
		contentPane.add(btnNumber4);
		
		JButton btnNumber6 = new JButton("6");
		btnNumber6.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNumber6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (isEqualsPress) {
					isEqualsPress = false;
					txtResult.setText("");
				}
				String cmd = e.getActionCommand();
				txtResult.setText(txtResult.getText() + cmd);
			}
		});
		btnNumber6.setBounds(219, 181, 89, 40);
		contentPane.add(btnNumber6);
		
		JButton btnMultiply = new JButton("*");
		btnMultiply.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String cmd = e.getActionCommand();
				operator = cmd;
				operandl = txtResult.getText();
				txtResult.setText("");
			}
		});
		btnMultiply.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnMultiply.setBounds(313, 181, 89, 40);
		contentPane.add(btnMultiply);
		
		JButton btnNumber5 = new JButton("5");
		btnNumber5.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNumber5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (isEqualsPress) {
					isEqualsPress = false;
					txtResult.setText("");
				}
				String cmd = e.getActionCommand();
				txtResult.setText(txtResult.getText() + cmd);
			}
		});
		btnNumber5.setBounds(125, 181, 89, 40);
		contentPane.add(btnNumber5);
		
		JButton btnNumber7 = new JButton("7");
		btnNumber7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (isEqualsPress) {
					isEqualsPress = false;
					txtResult.setText("");
				}
				String cmd = e.getActionCommand();
				txtResult.setText(txtResult.getText() + cmd);
			}
		});
		btnNumber7.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNumber7.setBounds(31, 130, 89, 40);
		contentPane.add(btnNumber7);
		
		JButton btnNumber8 = new JButton("8");
		btnNumber8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (isEqualsPress) {
					isEqualsPress = false;
					txtResult.setText("");
				}
				String cmd = e.getActionCommand();
				txtResult.setText(txtResult.getText() + cmd);
			}
		});
		btnNumber8.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNumber8.setBounds(125, 130, 89, 40);
		contentPane.add(btnNumber8);
		
		JButton btnNumber9 = new JButton("9");
		btnNumber9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (isEqualsPress) {
					isEqualsPress = false;
					txtResult.setText("");
				}
				String cmd = e.getActionCommand();
				txtResult.setText(txtResult.getText() + cmd);
			}
		});
		btnNumber9.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNumber9.setBounds(219, 130, 89, 40);
		contentPane.add(btnNumber9);
		
		JButton btnDivine = new JButton("/");
		btnDivine.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String cmd = e.getActionCommand();
				operator = cmd;
				operandl = txtResult.getText();
				txtResult.setText("");
			}
		});

		btnDivine.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnDivine.setBounds(313, 130, 89, 40);
		contentPane.add(btnDivine);
		
		JButton btnNewButton_14 = new JButton("%");
		btnNewButton_14.setBounds(31, 79, 89, 40);
		contentPane.add(btnNewButton_14);
		
		JButton btnPlus = new JButton("+/-");
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					double value = Double.parseDouble(txtResult.getText());
					value = -value;
					txtResult.setText("" + value);
				} catch (Exception e2) {
					
				}
			}
		});
		btnPlus.setBounds(125, 79, 89, 40);
		contentPane.add(btnPlus);
		
		
		
		JButton btnClear = new JButton("C");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String text = txtResult.getText();
				if (!text.isEmpty()) {
                    // Loại bỏ ký tự cuối cùng
                    String newText = text.substring(0, text.length() - 1);
                    // Cập nhật lại nội dung của JTextField với chuỗi đã chỉnh sửa
                    txtResult.setText(newText);
                }
			}
		});
		btnClear.setBounds(219, 79, 89, 40);
		contentPane.add(btnClear);
		
		JButton btnAllclear = new JButton("AC");
		btnAllclear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtResult.setText("");
			}
		});
		btnAllclear.setForeground(new Color(255, 255, 255));
		btnAllclear.setBackground(new Color(255, 0, 0));
		btnAllclear.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnAllclear.setBounds(313, 79, 89, 40);
		contentPane.add(btnAllclear);
		
		
		
		txtResult = new JTextField();
		txtResult.setFont(new Font("Tahoma", Font.PLAIN, 40));
		txtResult.setHorizontalAlignment(SwingConstants.RIGHT);
		txtResult.setBounds(31, 11, 371, 57);
		contentPane.add(txtResult);
		((AbstractDocument) txtResult.getDocument()).setDocumentFilter(new DocumentFilter() {
            private int maxCharacters = 15; // Giới hạn số kí tự

            public void insertString(FilterBypass fb, int offset, String string, javax.swing.text.AttributeSet attr) throws BadLocationException {
            	StringBuilder sb = new StringBuilder();
            	for (char c : string.toCharArray()) {
                    if (Character.isDigit(c)|| c == '.') { // Chỉ cho phép kí tự số
                        sb.append(c);
                    }
                }
            	if ((fb.getDocument().getLength() + sb.toString().length()) <= maxCharacters) {
                    super.insertString(fb, offset, sb.toString(), attr); // Cho phép thêm chuỗi
                }
            }

            public void replace(FilterBypass fb, int offset, int length, String text, javax.swing.text.AttributeSet attrs) throws BadLocationException {
            	StringBuilder sb = new StringBuilder();
                for (char c : text.toCharArray()) {
                    if (Character.isDigit(c)|| c == '.') { // Chỉ cho phép kí tự số
                        sb.append(c);
                    }
                }
            	if ((fb.getDocument().getLength() + sb.toString().length() - length) <= maxCharacters) {
                    super.replace(fb, offset, length, sb.toString(), attrs); // Cho phép thay thế chuỗi
                }
            }
        });
	}
}
