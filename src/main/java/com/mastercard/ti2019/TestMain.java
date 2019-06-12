package com.mastercard.ti2019;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Paint;
import java.awt.Stroke;

import javax.swing.JFrame;

import org.apache.commons.collections15.Transformer;

import edu.uci.ics.jung.algorithms.layout.CircleLayout;
import edu.uci.ics.jung.graph.DirectedSparseMultigraph;
import edu.uci.ics.jung.graph.Graph;
import edu.uci.ics.jung.visualization.VisualizationImageServer;
import edu.uci.ics.jung.visualization.decorators.ToStringLabeller;

public class TestMain {

	public static void main(String[] args) {
		Graph<String, String> g = new DirectedSparseMultigraph<String, String>();
		g.addVertex((String) "1");
		g.addVertex((String) "2");
		g.addVertex((String) "3");
		g.addEdge("Edge-A", "1", "2");
		g.addEdge("Edge-B", "2", "3");
		System.out.println("The graph g = " + g.toString());

		VisualizationImageServer vs = new VisualizationImageServer(new CircleLayout(g), new Dimension(640, 840));

		// vs.setRenderContext();

		/*
		 * BasicVisualizationServer<Integer, String> vs = new
		 * BasicVisualizationServer<Integer, String>(new CircleLayout(g));
		 * vs.setPreferredSize(new Dimension(350, 350));
		 */
		Transformer<String, Paint> vertexPaint = new Transformer<String, Paint>() {
			public Paint transform(String i) {
				return Color.GREEN;
			}
		};
		float dash[] = { 10.0f };
		final Stroke edgeStroke = new BasicStroke(1.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_MITER, 10.0f, dash,
				0.0f);
		Transformer<String, Stroke> edgeStrokeTransformer = new Transformer<String, Stroke>() {
			public Stroke transform(String s) {
				return edgeStroke;
			}
		};
		vs.getRenderContext().setVertexFillPaintTransformer(vertexPaint);
		vs.getRenderContext().setEdgeStrokeTransformer(edgeStrokeTransformer);
		vs.getRenderContext().setVertexLabelTransformer(new ToStringLabeller());
		vs.getRenderContext().setEdgeLabelTransformer(new ToStringLabeller());
		JFrame frame = new JFrame();
		frame.setSize(640, 480);
		frame.getContentPane().add(vs);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
	}

}
