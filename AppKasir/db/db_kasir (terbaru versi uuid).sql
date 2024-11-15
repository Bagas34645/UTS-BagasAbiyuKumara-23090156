CREATE DATABASE IF NOT EXISTS db_kasir;

USE db_kasir;

CREATE TABLE kategori(
 uuid_kategori CHAR(36) PRIMARY KEY,
 nama_kategori VARCHAR(255),
 create_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
 update_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
);

CREATE TABLE supplier(
 uuid_supplier CHAR(36) PRIMARY KEY,
 nama_supplier VARCHAR(255),
 alamat VARCHAR(255),
 telepon VARCHAR(20),
 create_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
 update_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
);

CREATE TABLE pelanggan(
 uuid_pelanggan CHAR(36) PRIMARY KEY,
 nama_pelanggan VARCHAR(255),
 alamat VARCHAR(255),
 telepon VARCHAR(20),
 create_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
 update_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
);

CREATE TABLE karyawan(
 uuid_karyawan CHAR(36) PRIMARY KEY,
 nama_karyawan VARCHAR(255),
 username VARCHAR(100),
 PASSWORD VARCHAR(255),
 create_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
 update_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
);

CREATE TABLE produk(
 uuid_produk CHAR(36) PRIMARY KEY,
 nama_produk VARCHAR (255),
 harga DECIMAL (10,2),
 stok INTEGER,
 uuid_kategori CHAR(36),
 uuid_supplier CHAR(36),
 barcode VARCHAR(50),
 create_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
 update_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
 FOREIGN KEY (uuid_kategori) REFERENCES kategori(uuid_kategori),
 FOREIGN KEY (uuid_supplier) REFERENCES supplier(uuid_supplier)
);

CREATE TABLE penjualan(
 uuid_penjualan CHAR(36) PRIMARY KEY,
 uuid_karyawan CHAR(36),
 uuid_pelanggan CHAR(36),
 tanggal DATE,
 total_harga DECIMAL(10,2),
 create_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
 update_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
 FOREIGN KEY (uuid_karyawan) REFERENCES karyawan(uuid_karyawan),
 FOREIGN KEY (uuid_pelanggan) REFERENCES pelanggan(uuid_pelanggan)
);

CREATE TABLE detail_penjualan(
 uuid_detail_penjualan CHAR(36) PRIMARY KEY,
 uuid_penjualan CHAR(36),
 uuid_produk CHAR(36),
 jumlah INTEGER,
 harga_satuan DECIMAL(10,2),
 subtotal DECIMAL(10,2),
 create_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
 update_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
 FOREIGN KEY (uuid_penjualan) REFERENCES penjualan(uuid_penjualan),
 FOREIGN KEY (uuid_produk) REFERENCES produk(uuid_produk)
);

CREATE TABLE retur_penjualan(
 uuid_retur_penjualan CHAR(36) PRIMARY KEY,
 uuid_karyawan CHAR(36),
 uuid_penjualan CHAR(36),
 tanggal_retur DATE,
 alasan VARCHAR(255),
 create_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
 update_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
 FOREIGN KEY (uuid_karyawan) REFERENCES karyawan(uuid_karyawan),
 FOREIGN KEY (uuid_penjualan) REFERENCES penjualan(uuid_penjualan)
);

CREATE TABLE pembelian(
 uuid_pembelian CHAR(36) PRIMARY KEY,
 uuid_karyawan CHAR(36),
 uuid_supplier CHAR(36),
 tanggal DATE,
 total_harga DECIMAL(10,2),
 create_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
 update_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
 FOREIGN KEY (uuid_karyawan) REFERENCES karyawan(uuid_karyawan),
 FOREIGN KEY (uuid_supplier) REFERENCES supplier(uuid_supplier)
);

CREATE TABLE detail_pembelian(
 uuid_detail_pembelian CHAR(36) PRIMARY KEY,
 uuid_pembelian CHAR(36),
 uuid_produk CHAR(36),
 jumlah INTEGER,
 harga_satuan DECIMAL(10,2),
 subtotal DECIMAL(10,2),
 create_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
 update_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
 FOREIGN KEY (uuid_pembelian) REFERENCES pembelian(uuid_pembelian),
 FOREIGN KEY (uuid_produk) REFERENCES produk(uuid_produk)
);

CREATE TABLE retur_pembelian(
 uuid_retur_pembelian CHAR(36) PRIMARY KEY,
 uuid_karyawan CHAR(36),
 uuid_pembelian CHAR(36),
 tanggal_retur DATE,
 alasan VARCHAR(255),
 create_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
 update_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
 FOREIGN KEY (uuid_karyawan) REFERENCES karyawan(uuid_karyawan),
 FOREIGN KEY (uuid_pembelian) REFERENCES pembelian(uuid_pembelian)
);
