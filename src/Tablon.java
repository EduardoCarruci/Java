
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;


public class Tablon {
	

	private int id;
	private JTable tablaso;
	private JScrollPane scroll;
	private JPanel panel;
	private MenuFrame menu;
	private DefaultTableModel model;
	private JLabel label;
	private boolean[] numeros;


	Tablon(int id, JPanel panel, JLabel label, boolean[] numeros) {
		this.panel = panel;
		menu = new MenuFrame(this);
		this.label = label;
		this.id = id;
		this.numeros = numeros;		
	}	

	public JLabel getLabel() {
		return label;
	}
	
	public void creartabla() {
		Object[] array = {"Acceso", "Tipo ", "Nombre"};
		Object[][] matriz = { 
			{" "},
			{" "},
			{" "},
			{" "},
			{" "},
			{" "},
			{" "}, 
		
		};
	

		model = new DefaultTableModel(matriz, array);

		tablaso = new JTable(model);


		scroll = new JScrollPane(tablaso);

		tablaso.addMouseListener(new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent evt) {
			
				if (evt.isMetaDown()) {

					menu.setVisible(true);

					menu.setLocationRelativeTo(scroll);
				}
			}

			@Override
			public void mousePressed(MouseEvent e) {

			}

			@Override
			public void mouseReleased(MouseEvent e) {

			}

			@Override
			public void mouseEntered(MouseEvent e) {

			}

			@Override
			public void mouseExited(MouseEvent e) {

			}
		});

		panel.add(scroll);

	}

	public JTable getTable() {
		return tablaso;
	}

	public DefaultTableModel getModel() {
		return model;
	}

	public void eliminar() {
		int row = tablaso.getSelectedRow();
		int max = tablaso.getRowCount();
		if (row >= 0 && row < max) {
			model.removeRow(row);
		}

	}

	public void agregar() {

		String[] row = new String[model.getColumnCount()];
		model.addRow(row);
	}

	public void delete() {

		while (model.getRowCount() > 0) {
			model.removeRow(0);
		}

		tablaso.getTableHeader().setUI(null);
		scroll.removeAll();
		scroll.setUI(null);
		scroll.revalidate();
		tablaso.revalidate();
		tablaso.setVisible(false);
		scroll.setVisible(false);
		label.setText(" ");
		numeros[id] = false;

	}
	
	
}
