package com.example.noleggio.model;


	
	import java.sql.Date;
	import java.time.LocalDateTime;
	import java.util.List;

	import javax.persistence.Column;
	import javax.persistence.Entity;
	import javax.persistence.GeneratedValue;
	import javax.persistence.GenerationType;
	import javax.persistence.Id;
	import javax.persistence.JoinColumn;
	import javax.persistence.ManyToOne;
	import javax.persistence.OneToMany;

	import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
	@Entity
	public class DataDisponibile {
		@Id
		@GeneratedValue(strategy=GenerationType.AUTO)
		@Column(name="id_data_disponibile")
		private long idDataDisponibile;
		@Column(name="data_inizio")
		private LocalDateTime dataInizio;
		@Column(name="data_fine")
		private LocalDateTime dataFine;
		//fk_id_automobile
		
		public DataDisponibile() {}
		public DataDisponibile(long idDataDisponibile, LocalDateTime dataInizio, LocalDateTime dataFine) {
			this.idDataDisponibile=idDataDisponibile;
			this.dataInizio=dataInizio;
			this.dataFine=dataFine;
		}
		
		public long getIdDataDisponibile() {
			return idDataDisponibile;
		}
		public void setIdDataDisponibile(long idDataDisponibileo) {
			this.idDataDisponibile = idDataDisponibile;
		}
		public LocalDateTime getDataInizio() {
			return dataInizio;
		}
		public void setDataInizio(LocalDateTime dataInizio) {
			this.dataInizio = dataInizio;
		}
		public LocalDateTime getDataFine() {
			return dataFine;
		}
		public void setDataFine(LocalDateTime dataFine) {
			this.dataFine = dataFine;
		}
		@Override
		public String toString() {
			return "DataDisponibile [idDataDisponibile=" + idDataDisponibile + ", dataInizio=" + dataInizio + ", dataFine=" + dataFine
					+ "]";
		}
		
		
		@ManyToOne
	    @JoinColumn(name = "fk_id_automobile", referencedColumnName = "id_automobile")
	    @JsonIgnoreProperties("dataDisponibile")
		
		private Automobile automobile;
		
		public Automobile getAutomobile() {
			return automobile;
		}
		
		
		/*
		@OneToMany( mappedBy = "dataDisponibile")
	    @JsonIgnoreProperties("dataDisponibile")
		
	    
		private List<SettoreDataEvento> settoreDataEventi;
			
		public List<SettoreDataEvento> getSettoreDataEventi() {
			return settoreDataEventi;
		}
		public void setSettoreDataEventi(List<SettoreDataEvento> settoreDataEventi) {
			this.settoreDataEventi=settoreDataEventi;
		}
		*/

}
