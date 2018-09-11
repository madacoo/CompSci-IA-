package userInterface;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Base {
	
	private static String resourcePath = "/home/madacoo/Desktop/robert_choy/resources/";
	
	// Style
    Font fheader = new Font("Serif", 1, 52);
    Font sheader = new Font("Serif", 3, 30);
    Font bodytext = new Font("Serif", 3, 24);
    Font buttontext = new Font("Serif", 1, 11);
	
	static JFrame baseFrame;
	static JFrame dummyFrame;
	static JFrame systemFrame;
	static JFrame cpuFrame;
	static JFrame gpuFrame;
	static JFrame radFrame;
	static JFrame tubFrame;
	static JFrame resFrame;
	static JFrame pumpFrame;
	static JFrame fitFrame;
	static JFrame coolFrame;
	
	
	static JFrame currentFrame;
	int x;
	int y;
	
	
	public Base() {
		x = 200;
		y = 200;
		baseFrame = createBaseFrame();
		dummyFrame = createDummyFrame();
		
		currentFrame = baseFrame;
		
		
		systemFrame = currentFrame; 
		cpuFrame = createCpuFrame(); 
		gpuFrame = createGpuFrame(); 
		radFrame = createRadFrame(); 
		tubFrame = createTubFrame(); 
		resFrame = createresFrame(); 
		pumpFrame = createPumpFrame(); 
		fitFrame = createFitFrame(); 
		coolFrame = createCoolFrame(); 
		
	}
	
	public JFrame createBaseFrame() {
		JFrame frame = new JFrame("WCS");
		
        frame.setSize(1220,800);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setBackground(Color.GRAY);
        
		Component[] mainComponents = createMainComponents();
		Component[] firstViewComponents = createFirstViewComponents();
		
    	for (int i = 0; i < mainComponents.length; i++) {
    		frame.add(mainComponents[i]);
    	}
    	for (int i = 0; i < firstViewComponents.length; i++) {
    		frame.add(firstViewComponents[i]);
    	}
		
    	return frame;
		
	}
	public JFrame createCpuFrame() {
		JFrame frame = new JFrame ("cpu123");
        frame.setSize(1220,800);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setBackground(Color.GRAY);
        
		JLabel testtitle = new JLabel ("cpu123"); 
		testtitle.setForeground(Color.BLUE);
        testtitle.setFont(fheader);
        testtitle.setBounds (20,150,1000,300);
        frame.add(testtitle);
        
        Component[] mainComponents = createMainComponents();
    	for (int i = 0; i < mainComponents.length; i++) {
    		frame.add(mainComponents[i]);
		
		
    	}
		return frame;
	}
	public JFrame createGpuFrame() {
		JFrame frame = new JFrame ("gpu123");
        frame.setSize(1220,800);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setBackground(Color.GRAY);
        
		JLabel testtitle = new JLabel ("gpu123"); 
		testtitle.setForeground(Color.BLUE);
        testtitle.setFont(fheader);
        testtitle.setBounds (20,150,1000,300);
        frame.add(testtitle);
        
        Component[] mainComponents = createMainComponents();
    	for (int i = 0; i < mainComponents.length; i++) {
    		frame.add(mainComponents[i]);
		
		
    	}
		return frame;
	}
	
	
	public JFrame createRadFrame() {
		JFrame frame = new JFrame ("rad123");
        frame.setSize(1220,800);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setBackground(Color.GRAY);
        
		JLabel testtitle = new JLabel ("rad123"); 
		testtitle.setForeground(Color.BLUE);
        testtitle.setFont(fheader);
        testtitle.setBounds (20,150,1000,300);
        frame.add(testtitle);
        
        Component[] mainComponents = createMainComponents();
    	for (int i = 0; i < mainComponents.length; i++) {
    		frame.add(mainComponents[i]);
		
		
    	}
		return frame;
	}
	
	public JFrame createTubFrame() {
		JFrame frame = new JFrame ("tube123");
        frame.setSize(1220,800);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setBackground(Color.GRAY);
        
		JLabel testtitle = new JLabel ("tube123"); 
		testtitle.setForeground(Color.BLUE);
        testtitle.setFont(fheader);
        testtitle.setBounds (20,150,1000,300);
        frame.add(testtitle);
        
        Component[] mainComponents = createMainComponents();
    	for (int i = 0; i < mainComponents.length; i++) {
    		frame.add(mainComponents[i]);
		
		
    	}
		return frame;
	}
	
	public JFrame createresFrame() {
		JFrame frame = new JFrame ("res123");
        frame.setSize(1220,800);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setBackground(Color.GRAY);
        
		JLabel testtitle = new JLabel ("res123"); 
		testtitle.setForeground(Color.BLUE);
        testtitle.setFont(fheader);
        testtitle.setBounds (20,150,1000,300);
        frame.add(testtitle);
        
        Component[] mainComponents = createMainComponents();
    	for (int i = 0; i < mainComponents.length; i++) {
    		frame.add(mainComponents[i]);
		
		
    	}
		return frame;
	}
	
	public JFrame createPumpFrame() {
		JFrame frame = new JFrame ("pump123");
        frame.setSize(1220,800);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setBackground(Color.GRAY);
        
		JLabel testtitle = new JLabel ("pump123"); 
		testtitle.setForeground(Color.BLUE);
        testtitle.setFont(fheader);
        testtitle.setBounds (20,150,1000,300);
        frame.add(testtitle);
        
        Component[] mainComponents = createMainComponents();
    	for (int i = 0; i < mainComponents.length; i++) {
    		frame.add(mainComponents[i]);
		
		
    	}
		return frame;
	}
	
	public JFrame createFitFrame() {
		JFrame frame = new JFrame ("fitting123");
        frame.setSize(1220,800);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setBackground(Color.GRAY);
        
		JLabel testtitle = new JLabel ("fitting123"); 
		testtitle.setForeground(Color.BLUE);
        testtitle.setFont(fheader);
        testtitle.setBounds (20,150,1000,300);
        frame.add(testtitle);
        
        Component[] mainComponents = createMainComponents();
    	for (int i = 0; i < mainComponents.length; i++) {
    		frame.add(mainComponents[i]);
		
		
    	}
		return frame;
	}
	
	public JFrame createCoolFrame() {
		JFrame frame = new JFrame ("cool213");
        frame.setSize(1220,800);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setBackground(Color.GRAY);
        
		JLabel testtitle = new JLabel ("cool123"); 
		testtitle.setForeground(Color.BLUE);
        testtitle.setFont(fheader);
        testtitle.setBounds (20,150,1000,300);
        frame.add(testtitle);
        
        Component[] mainComponents = createMainComponents();
    	for (int i = 0; i < mainComponents.length; i++) {
    		frame.add(mainComponents[i]);
		
		
    	}
		return frame;
	}
	
	
	public JFrame createDummyFrame() {
		JFrame frame = new JFrame("WCS");
		
        frame.setSize(1220,800);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setBackground(Color.GRAY);
        
		JLabel testtitle = new JLabel ("testing123"); 
		testtitle.setForeground(Color.BLUE);
        testtitle.setFont(fheader);
        testtitle.setBounds (20,150,1000,300);
        frame.add(testtitle);
        
        Component[] mainComponents = createMainComponents();
    	for (int i = 0; i < mainComponents.length; i++) {
    		frame.add(mainComponents[i]);
    	}
		
    	return frame;
		
	}


    public Component[] createFirstViewComponents() {
    	
    	Component[] comps = new Component[4];
    	
    	int i = 0;
    	
        // Create Title Text
        JLabel title = new JLabel("Why Water-Cooling?");
        title.setForeground(Color.BLUE);
        title.setFont(fheader);
        title.setBounds (20,150,1000,300);
        comps[i++] = title;
        
        // Create Subtitle Text 
        JLabel subtitle = new JLabel("Why Not?");
        subtitle.setForeground(Color.BLACK);
        subtitle.setFont(sheader);
        subtitle.setBounds(15, 100, 500, 500);
        comps[i++] = subtitle;
        
        // Create Body Text 
        JLabel btext = new JLabel(""
        		+ "<html><p style=\"width:500px\">"
        		+ "In all seriousness, water-cooling your personal "
        		+ "computer is the next step in truly becoming an "
        		+ "enthusiast. The best components are only worthy of "
        		+ "the best cooling-system out there- water-cooling. "
        		+ "While water-cooling may seem extremely "
        		+ "complicated for the beginning novice, here at WCPC "
        		+ "we strive to simplify this process for oyu, and direct "
        		+ "you on your journey to becoming a water-cooler."
        		+ "</p></html>");
        btext.setForeground(Color.BLACK);
        btext.setFont(bodytext);
        btext.setBounds(15, 350, 1000, 250);
        comps[i++] = btext;
        
        // Create Front page photo 
        
        JLabel frontpic = new JLabel(new ImageIcon(resourcePath + "examplepic.JPG"));
        frontpic.setBounds(689, 270, 495, 350);
        comps[i++] = frontpic;

        
        return comps;
        
        
    }
    
	
	
	
	
    private static int xLocation(int n) {
    	return n*(120+12) + 18;
    }
    
    
    public void changeFrame(JFrame targetFrame) {
    	if (currentFrame == targetFrame) return;
		x = currentFrame.getX();
		y = currentFrame.getY();
		JFrame tmp = currentFrame;
		currentFrame = targetFrame;
		show();
		tmp.setVisible(false);
    }
    
    
    public Component[] createMainComponents() {
    	Component[] comps = new Component[11]; 
    	int i = 0;
    	
    	// Create banner
    	JLabel banner = new JLabel(new ImageIcon(resourcePath + "banner.png"));
        banner.setBounds(0, 0, 1212, 108);
        comps[i++] = banner;
        

        
        // Create buttons
        int bcount = 0; 
        
        // new system button
        // temporarily dummy test button
        JButton buildsys = new JButton(new ImageIcon(resourcePath + ""));
        buildsys.setBounds(xLocation(bcount++),115,120,120);
        buildsys.addActionListener(new ActionListener(){  
        	public void actionPerformed(ActionEvent e){ 
        		changeFrame(dummyFrame);
        	 }  
        });  
        comps[i++] = buildsys;

        // view water cooling parts button
        // temporarily first view button
        JButton viewcpu = new JButton(new ImageIcon());
        viewcpu.setBounds(xLocation(bcount++),115,120,120);
        viewcpu.addActionListener(new ActionListener(){  
        	public void actionPerformed(ActionEvent e){  
        		changeFrame(cpuFrame);
        	}  
        });  
        comps[i++] = viewcpu;
        
        JButton viewgpu = new JButton("View GPU Water-blocks",new ImageIcon(resourcePath + "gpuWaterblock.png"));
        viewgpu.setFont(buttontext);
        viewgpu.setBounds(xLocation(bcount++),115,120,120);
        viewgpu.setBackground(Color.ORANGE);
        viewgpu.addActionListener(new ActionListener(){  
        	
        	public void actionPerformed(ActionEvent e){  
        	            changeFrame(gpuFrame);  
        	        }  
        	    });  
        comps[i++] = viewgpu;
        
        JButton rad = new JButton(new ImageIcon());
        rad.setBounds(xLocation(bcount++),115,120,120);
        rad.addActionListener(new ActionListener(){  
        	public void actionPerformed(ActionEvent e){  
        	            changeFrame(radFrame);  
        	        }  
        	    });  
        comps[i++] = rad;
       
        JButton tube = new JButton(new ImageIcon());
        tube.setBounds(xLocation(bcount++),115,120,120);
        tube.addActionListener(new ActionListener(){  
        	public void actionPerformed(ActionEvent e){  
        	            changeFrame(tubFrame);  
        	        }  
        	    });  
        comps[i++] = tube;
        
        JButton res = new JButton(new ImageIcon());
        res.setBounds(xLocation(bcount++),115,120,120);
        res.addActionListener(new ActionListener(){  
        	public void actionPerformed(ActionEvent e){  
        	            changeFrame(resFrame);  
        	        }  
        	    });  
        comps[i++] = res;

        JButton pump = new JButton(new ImageIcon());
        pump.setBounds(xLocation(bcount++),115,120,120);
        pump.addActionListener(new ActionListener(){  
        	public void actionPerformed(ActionEvent e){  
        	            changeFrame(pumpFrame);  
        	        }  
        	    });  
        comps[i++] = pump;

        JButton fit = new JButton(new ImageIcon());
        fit.setBounds(xLocation(bcount++),115,120,120);
        fit.addActionListener(new ActionListener(){  
        	public void actionPerformed(ActionEvent e){  
        	            changeFrame(fitFrame);  
        	        }  
        	    });  
        comps[i++] = fit;

        JButton cool = new JButton(new ImageIcon());
        cool.setBounds(xLocation(bcount++),115,120,120);
        cool.addActionListener(new ActionListener(){  
        	public void actionPerformed(ActionEvent e){  
        	           changeFrame(coolFrame);  
        	        }  
        	    });  
        comps[i++] = cool;
        
        
        // Create TextIcon 
        
        JLabel botbanner = new JLabel(new ImageIcon(resourcePath + "botbanner2.png"));
        botbanner.setBounds(0, 800-185, 1212, 204);
        comps[i++] = botbanner;
        
    	return comps;
    }
    
    public void loadWorkspace(Component[] comps) {
    	for (int i = 0; i < comps.length; i++) {
    		baseFrame.add(comps[i]);
    	}
    	
    }
    
    public void unloadWorkspace(Component[] comps) {
    	for (int i = 0; i < comps.length; i++) {
    		baseFrame.remove(comps[i]);
    	}
    	
    }
    
    public void show() {
        // Show frame
    	currentFrame.setLocation(x, y);
        currentFrame.setLayout(null);
        currentFrame.setVisible(true);
    }
    
    
    

}