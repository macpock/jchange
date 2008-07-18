/*
 * TagJPanel.java
 *
 * Created on 16 de julio de 2008, 16:33
 */
package com.cartiec.jrenamer;

import com.cartiec.jrenamer.tags.TagID3;
import org.blinkenlights.jid3.ID3Exception;
import org.blinkenlights.jid3.v1.ID3V1Tag.Genre;
import org.blinkenlights.jid3.v1.ID3V1_0Tag;
import org.blinkenlights.jid3.v2.ID3V2_3_0Tag;

/**
 *
 * @author  Tonny
 */
public class TagJPanel extends javax.swing.JPanel {

    private String title = null;
    private String artist = null;
    private String album = null;
    private String genre = null;
    private String year = null;  
    private String comment = null;

    /** Creates new form TagJPanel */
    public TagJPanel() {
        initComponents();
    }

    public boolean load(TagID3 tag) {
        ID3V1_0Tag v1 = tag.getId3v1_0Tag();
        ID3V2_3_0Tag v2 = tag.getId3v2_3_0Tag();
        if (v2 != null) {
            title = v2.getTitle();
            artist = v2.getArtist();
            album = v2.getAlbum();
            genre = v2.getGenre();
            try {
                year = String.valueOf(v2.getYear());
            } catch (ID3Exception ex) {
                year = null;
            }
            comment = v2.getComment();
        }
        if (v1 != null) {
            if ((title == null) || ((title != null) && (title.equals("")))) {
                title = v1.getTitle();
            }
            if ((artist == null) || ((artist != null) && (artist.equals("")))) {
                artist = v1.getArtist();
            }
            if ((album == null) || ((album != null) && (album.equals("")))) {
                album = v1.getAlbum();
            }
            if ((genre == null) || ((genre != null) && (genre.equals("")))) {
                Genre g = v1.getGenre();
                if (g != null) {
                    genre = g.toString();
                }
            }
            if ((year == null) || ((year != null) && (year.equals("")))) {
                year = v1.getYear();
            }
            if ((comment == null) || ((comment != null) && (comment.equals("")))) {
                comment = v1.getComment();
            }
        }

        txfTitle.setText(title);
        txfArtist.setText(artist);
        txfAlbum.setText(album);
        txfGenre.setText(genre);
        txfYear.setText(year);
        txfComment.setText(comment);
        txfFile.setText(tag.getFile().getName());
        return (v1 != null) || (v2 != null);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitle = new javax.swing.JLabel();
        txfTitle = new javax.swing.JTextField();
        lblArtist = new javax.swing.JLabel();
        txfArtist = new javax.swing.JTextField();
        lblAlbum = new javax.swing.JLabel();
        txfAlbum = new javax.swing.JTextField();
        lblGenre = new javax.swing.JLabel();
        txfGenre = new javax.swing.JTextField();
        lblYear = new javax.swing.JLabel();
        txfYear = new javax.swing.JTextField();
        lblComment = new javax.swing.JLabel();
        txfComment = new javax.swing.JTextField();
        lblFile = new javax.swing.JLabel();
        txfFile = new javax.swing.JTextField();

        java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("com/cartiec/jrenamer/MainJFrame"); // NOI18N
        lblTitle.setText(bundle.getString("Título")); // NOI18N

        txfTitle.setBackground(new java.awt.Color(255, 255, 255));
        txfTitle.setEditable(false);

        lblArtist.setText(bundle.getString("Artista")); // NOI18N

        txfArtist.setBackground(new java.awt.Color(255, 255, 255));
        txfArtist.setEditable(false);

        lblAlbum.setText(bundle.getString("Album")); // NOI18N

        txfAlbum.setBackground(new java.awt.Color(255, 255, 255));
        txfAlbum.setEditable(false);

        lblGenre.setText(bundle.getString("Género")); // NOI18N

        txfGenre.setBackground(new java.awt.Color(255, 255, 255));
        txfGenre.setEditable(false);

        lblYear.setText(bundle.getString("Año")); // NOI18N

        txfYear.setBackground(new java.awt.Color(255, 255, 255));
        txfYear.setEditable(false);

        lblComment.setText(bundle.getString("Comentario")); // NOI18N

        txfComment.setBackground(new java.awt.Color(255, 255, 255));
        txfComment.setEditable(false);

        lblFile.setText(bundle.getString("Archivo")); // NOI18N

        txfFile.setBackground(new java.awt.Color(255, 255, 255));
        txfFile.setEditable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(lblYear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblComment, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(lblFile)
                    .addComponent(lblGenre, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAlbum, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblArtist, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txfTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 259, Short.MAX_VALUE)
                    .addComponent(txfArtist, javax.swing.GroupLayout.DEFAULT_SIZE, 259, Short.MAX_VALUE)
                    .addComponent(txfAlbum, javax.swing.GroupLayout.DEFAULT_SIZE, 259, Short.MAX_VALUE)
                    .addComponent(txfGenre, javax.swing.GroupLayout.DEFAULT_SIZE, 259, Short.MAX_VALUE)
                    .addComponent(txfFile, javax.swing.GroupLayout.DEFAULT_SIZE, 259, Short.MAX_VALUE)
                    .addComponent(txfComment, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 259, Short.MAX_VALUE)
                    .addComponent(txfYear, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 259, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTitle)
                    .addComponent(txfTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblArtist)
                    .addComponent(txfArtist, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAlbum)
                    .addComponent(txfAlbum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblGenre)
                    .addComponent(txfGenre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblYear)
                    .addComponent(txfYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblComment)
                    .addComponent(txfComment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFile)
                    .addComponent(txfFile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblAlbum;
    private javax.swing.JLabel lblArtist;
    private javax.swing.JLabel lblComment;
    private javax.swing.JLabel lblFile;
    private javax.swing.JLabel lblGenre;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblYear;
    private javax.swing.JTextField txfAlbum;
    private javax.swing.JTextField txfArtist;
    private javax.swing.JTextField txfComment;
    private javax.swing.JTextField txfFile;
    private javax.swing.JTextField txfGenre;
    private javax.swing.JTextField txfTitle;
    private javax.swing.JTextField txfYear;
    // End of variables declaration//GEN-END:variables
}
