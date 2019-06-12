package com.mastercard.ti2019;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Paint;
import java.awt.Stroke;

import javax.swing.JFrame;

import org.apache.commons.collections15.Transformer;

import edu.uci.ics.jung.algorithms.layout.CircleLayout;
import edu.uci.ics.jung.algorithms.layout.FRLayout;
import edu.uci.ics.jung.algorithms.layout.ISOMLayout;
import edu.uci.ics.jung.algorithms.layout.KKLayout;
import edu.uci.ics.jung.algorithms.layout.SpringLayout;
import edu.uci.ics.jung.algorithms.layout.TreeLayout;
import edu.uci.ics.jung.graph.DirectedSparseMultigraph;
import edu.uci.ics.jung.graph.Forest;
import edu.uci.ics.jung.graph.Graph;
import edu.uci.ics.jung.visualization.VisualizationImageServer;
import edu.uci.ics.jung.visualization.decorators.ToStringLabeller;

public class TestTransactionDisplay {
	public static void main(String[] args) {
		Graph<String, String> g = new DirectedSparseMultigraph<String, String>();
		for (int i = 1; i < 10; i++) {
			g.addVertex((String) "#900210"+i);
		}
		g.addEdge("Edge-1", "#9002101", "#9002102");
		g.addEdge("Edge-2", "#9002101", "#9002103");
		g.addEdge("Edge-3", "#9002102", "#9002104");
		g.addEdge("Edge-4", "#9002102", "#9002105");
		g.addEdge("Edge-5", "#9002103", "#9002106");
		g.addEdge("Edge-6", "#9002103", "#9002107");
		
		g.addEdge("Edge-14", "#9002107", "#9002109");
		
		g.addEdge("Edge-7", "#9002103", "#9002108");

		g.addEdge("Edge-8", "#9002102", "#9002109");
		g.addEdge("Edge-9", "#9002103", "#9002109");
		g.addEdge("Edge-10", "#9002104", "#9002109");
		g.addEdge("Edge-11", "#9002105", "#9002109");
		g.addEdge("Edge-12", "#9002106", "#9002109");
		g.addEdge("Edge-13", "#9002108", "#9002109");
		
		/**
		 * 
    KKLayout - The Kamada-Kawai algorithm for node layout
    FRLayout - The Fruchterman-Rheingold algorithm
    SpringLayout - A simple force-directed spring-embedder
    ISOMLayout - Meyer's "Self-Organizing Map" layout.
    CircleLayout - A simple layout places vertices randomly on a circle 
		 */
		
		VisualizationImageServer vs = new VisualizationImageServer(new FRLayout(g), new Dimension(400, 400));
		
		Transformer<String, Paint> vertexPaint = new Transformer<String, Paint>() {
			public Paint transform(String i) {
				if("#9002101".equalsIgnoreCase(i)) {
					return Color.GREEN;
				} else if("#9002109".equalsIgnoreCase(i)) {
					return Color.RED;
				} else {
					return Color.ORANGE;
				}
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
		//vs.getRenderContext().setEdgeStrokeTransformer(edgeStrokeTransformer);
		vs.getRenderContext().setVertexLabelTransformer(new ToStringLabeller());
		//vs.getRenderContext().setEdgeLabelTransformer(new ToStringLabeller());
		JFrame frame = new JFrame();
		frame.setSize(740, 880);
		frame.getContentPane().add(vs);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
	}
}
