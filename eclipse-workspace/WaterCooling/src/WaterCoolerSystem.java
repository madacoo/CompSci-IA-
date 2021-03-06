import java.util.ArrayList;

public class WaterCoolerSystem {

	
	CPU cpu; 
	GPU gpu;
	GPUWaterblock gwb; 
	CPUWaterblock cwb; 
	Radiator rad; 
	Tubing tub; 
	Reservoir res; 
	Pump pump; 
	Fittings fit; 
	Coolant cool; 
	Case c4; 
	
	ArrayList<String> errors;
	ArrayList<String> advice;

	
	
	public WaterCoolerSystem() {
	}
	
	public WaterCoolerSystem(CPU cpu, GPU gpu,  CPUWaterblock cwb, GPUWaterblock gwb, Radiator rad, Tubing tub, Reservoir res, Pump pump, Fittings fit, Coolant cool) {  
		this.cpu = cpu; 
		this.gpu = gpu; 
		this.cwb = cwb; 
		this.gwb = gwb; 
		this.rad = rad; 
		this.tub = tub; 
		this.res = res;
		this.pump = pump; 
		this.fit = fit; 
		this.cool = cool;
	}
	public void setCpu(CPU cpu) {
		this.cpu = cpu; 
	}
	
	public void setGpu(GPU gpu) {
		this.gpu = gpu; 
	}

	
	public void setCWB(CPUWaterblock cwb) {
		this.cwb = cwb; 
	}
	
	public void setGWB(GPUWaterblock gwb) {
		this.gwb = gwb; 

	}
	
	public void setRad(Radiator rad) {
		this.rad = rad; 

	}

	public void setTub(Tubing tub) {
		this.tub = tub; 
	}
	
	public void setRes(Reservoir res) {
		this.res = res;
	}
	
	public void setPump(Pump pump) {
		this.pump = pump; 
	}
	
	public void setFit(Fittings fit) {
		this.fit = fit; 
	}
	
	public void setCool(Coolant cool) {
		this.cool = cool;
	}
	

	public String CPUtoString() {
		if(cpu == null) {
			return "No CPU";
		} else { 
			return cpu.toString();
		}
	}
	public String GPUtoString() {
		if(gpu == null) {
			return "No GPU";
		} else { 
			return gpu.toString();
		}
	}
	public String CPUWBtoString() {
		if(cwb == null) {
			return "No CPU WB";
		} else { 
			return cwb.toString();
		}
	}
	public String GPUWBtoString() {
		if(gwb == null) {
			return "No GPU WB";
		} else { 
			return gwb.toString();
		}
	}
	public String RadtoString() {
		if(rad == null) {
			return "No Radiator";
		} else { 
			return rad.toString();
		}
		
	}
	
	public String TubtoString() {
		if(tub == null) {
			return "No Tubing";
		} else { 
			return tub.toString();
		}
	}
	public String RestoString() {
		if(res == null) {
			return "No Reservoir";
		} else { 
			return res.toString();
		}
	}

	public String PumptoString() {
		if(pump == null) {
			return "No Pump";
		} else { 
			return pump.toString();
		}
	}
	public String FittoString() {
		if(fit == null) {
			return "No Fittings";
		} else { 
			return fit.toString();
		}
	}
	public String CooltoString() {
		if(cool == null) {
			return "No Coolant";
		} else { 
			return cool.toString();
		}
	}
	
	
	

	
	
	public boolean uniformMetals() {
		String m1 = this.cwb.metal;
		String m2 = this.gwb.metal; 
		String m3 = this.rad.metal;
		return m1.equals(m2) && m2.equals(m3);
		
	}
	
	public void check() {
		errors = new ArrayList<String>();
		advice = new ArrayList<String>();  
		
		if(cpu == null) return;
		if(gpu == null) return;
		if(cwb == null) return;
		if(gwb == null) return;
		if(rad == null) return;
		if(tub == null) return;
		if(res == null) return;
		if(pump == null) return;
		if(fit == null) return; 
		if(cool == null) return;
		
		
		
		
		if(this.cwb.socket != this.cpu.socket) {
			errors.add("The currently selected CPU Waterblock is incompatible with your current CPU Model."
					+ " Please select another CPU Waterblock."); 
		}
		
		if(this.gwb.model != this.gpu.toString()) {
			errors.add("The currently selected GPU Waterblock is incompatible with your current GPU Model."
					+ "Please select another GPU Waterblock.");
		}
		
		if(this.tub.bendable.equals(false)) {
			
			advice.add("The currently selected Tubing does not support heat-treatment to enable bendability,"
					+ "the use of angled fittings is required in your currently selected water-cooling system.");
		} 
		

		if(this.res.combo.equals("False")) {
			advice.add("The currently selected reservoir does not contain a pump unit,"
					+ "you would have to purchase an additional pumo unit for your system to function properly.");
		}
		
		if(this.tub.diameter.equals(this.fit.diameter)) {
			advice.add("Do ensure that you have the required number of fittings for your system. "
					+ "Each component generally requires 2 - 3 fittings depending on the configuration. Also ensure that"
					+ "your fitting corrosponds with your tubing diameter to ensure compatibility.");
		}
		
		if(this.cool.edible.equals("True")) {
			advice.add("The currently selected coolant does not contain some form of biocide/silver coil and will require biocide/silver coil"
					+ "to be incorporated into the coolant to deter bacterial grwoth.");

		}
		
		if(!uniformMetals() ) {
			advice.add("The current selection of radiators, CPU waterblock and GPU waterblock(s) have different "
					+ "set(s) of metals, to ensure system longevity, we recommend keeping all metals uniform to prevent metal corrosion.");
		} 
		advice.add("While the current system checker may or may not highlight a metal difference between the selected components, it is highly adviced that you research "
				+ "the selected components individually to ensure a uniform metal, in order to ensure system longvity.");
		
		
		
	}
	
	public ArrayList<String> getAdvice() {
		return this.advice;
	}
	
	public ArrayList<String> getErrors() {
		return this.errors;
	}
	
	
	
}

