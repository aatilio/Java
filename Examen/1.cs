using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace VaidrollTeamWindowsFormsApp1
{
    public partial class Form1 : Form
    {
        
        public Form1()
        {
            InitializeComponent();
        }
        void limpiar() 
        {
            txtCodProducto.Text ="";
            txtproducto.Text = "";
            txtPrecio.Text = "";
            txtStock.Text = "";
        }
        private void btnregistrar_Click(object sender, EventArgs e)
        {

            object[] agregardato = 
                    {
                    txtCodProducto.Text,
                    txtproducto.Text,
                    txtPrecio.Text, 
                    txtStock.Text, 
                    };
                    dataGridView1.Rows.Add(agregardato);
            MessageBox.Show("Producto ingresado correctamente.","Mensaje");
            limpiar();
        }

        private void Form1_Load(object sender, EventArgs e)
        {
            dataGridView1.ColumnHeadersDefaultCellStyle.BackColor = ColorTranslator.FromHtml("#1760D6");
            dataGridView1.ColumnHeadersDefaultCellStyle.ForeColor = ColorTranslator.FromHtml("#FFFFFF");
            limpiar();
        }

        private void btneliminar_Click(object sender, EventArgs e)
        {
            if (dataGridView1.RowCount != 0)
            {
                int fil = dataGridView1.CurrentRow.Index;
                dataGridView1.Rows.RemoveAt(fil);
                MessageBox.Show("Producto eliminado.", "Mensaje");
            }
            limpiar();
        }

        private void btnsalir_Click(object sender, EventArgs e)
        {
            Close();
        }

        private void btnmodificar_Click(object sender, EventArgs e)
        {
            if (dataGridView1.RowCount != 0)
            {
                int indice = dataGridView1.CurrentRow.Index;
                dataGridView1.Rows[indice].Cells[0].Value = txtCodProducto.Text;
                dataGridView1.Rows[indice].Cells[1].Value = txtproducto.Text;
                dataGridView1.Rows[indice].Cells[2].Value = txtPrecio.Text;
                dataGridView1.Rows[indice].Cells[3].Value = txtStock.Text;
                MessageBox.Show("Producto modificado correctamente.", "Mensaje");
            }
        }

        private void dataGridView1_CellContentClick(object sender, DataGridViewCellEventArgs e)
        {
            if (dataGridView1.RowCount != 0)
            {
                int fila = dataGridView1.CurrentCell.RowIndex;
                txtCodProducto.Text = dataGridView1[0, fila].Value.ToString();
                txtproducto.Text = dataGridView1[1, fila].Value.ToString();
                txtPrecio.Text = dataGridView1[2, fila].Value.ToString();
                txtStock.Text = dataGridView1[3, fila].Value.ToString();
            }
        }

        private void btnnuevo_Click(object sender, EventArgs e)
        {
            limpiar();
        }
    }
}
