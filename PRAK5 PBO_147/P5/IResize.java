// Nama File: IResize.java
// Deskripsi: Interface untuk objek yang dapat di-resize
// Pembuat: Eliza Talent Sirait / 24060123140147
// Tanggal: 23 Maret 2025

public interface IResize {
    // Method untuk memperbesar ukuran sebesar 10%
    void zoomIn();

    // Method untuk memperkecil ukuran sebesar 10%
    void zoomOut();

    // Method untuk menskalakan ukuran berdasarkan persentase yang diberikan
    void zoom(int percent);
}