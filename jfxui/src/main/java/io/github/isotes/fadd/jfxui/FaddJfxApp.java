package io.github.isotes.fadd.jfxui;

import io.github.isotes.fadd.library.FMath;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import org.apache.commons.math3.fraction.Fraction;

import java.util.stream.Stream;

public class FaddJfxApp extends Application {
	private TextField tfNa;
	private TextField tfDa;
	private TextField tfNb;
	private TextField tfDb;
	private TextField tfNr;
	private TextField tfDr;

	private void calc() {
		try {
			int na = Integer.parseInt(tfNa.getText());
			int da = Integer.parseInt(tfDa.getText());
			int nb = Integer.parseInt(tfNb.getText());
			int db = Integer.parseInt(tfDb.getText());
			System.out.println(na + "_" + da + "_" + nb + "_" + db);
			Fraction r = FMath.add(na, da, nb, db);
			tfNr.setText(Integer.toString(r.getNumerator()));
			tfDr.setText(Integer.toString(r.getDenominator()));
		} catch (Exception ex) {
			tfNr.setText("-");
			tfDr.setText("-");
		}
	}

	@Override
	public void start(Stage stage) {
		tfNa = new TextField("1");
		tfDa = new TextField("2");
		tfNb = new TextField("1");
		tfDb = new TextField("4");
		tfNr = new TextField();
		tfDr = new TextField();
		tfNr.setEditable(false);
		tfDr.setEditable(false);

		Stream.of(tfNa, tfDa, tfNb, tfDb, tfNr, tfDr).forEach(t -> t.setPrefWidth(60));

		Stream.of(tfNa, tfDa, tfNb, tfDb).forEach(t -> t.textProperty().addListener((observable, oldValue, newValue) -> {
			calc();
		}));

		calc();

		GridPane gridPane = new GridPane();

		gridPane.setMinSize(400, 200);
		gridPane.setVgap(3);
		gridPane.setHgap(3);

		gridPane.setAlignment(Pos.CENTER);

		gridPane.add(tfNa, 0, 0);
		gridPane.add(tfDa, 0, 2);
		gridPane.add(new Text("+"), 1, 0, 1, 3);
		gridPane.add(tfNb, 2, 0);
		gridPane.add(tfDb, 2, 2);
		gridPane.add(new Text("="), 3, 0, 1, 3);
		gridPane.add(tfNr, 4, 0);
		gridPane.add(tfDr, 4, 2);

		Scene scene = new Scene(gridPane);
		stage.setTitle("Add Fractions");
		stage.setScene(scene);
		stage.show();
	}

	public static void main(String[] args) {
		launch();
	}
}
