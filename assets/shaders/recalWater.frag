#define HIGHP

uniform sampler2D u_texture;

uniform vec2 u_campos;
uniform vec2 u_resolution;
uniform float u_time;

varying vec2 v_texCoords;

const float mscl = 40.0;

void main(){

	vec2 c = v_texCoords;
	vec2 v = vec2(1.0/u_resolution.x, 1.0/u_resolution.y);
	vec2 coords = vec2(c.x / v.x + u_campos.x, c.y / v.y + u_campos.y);

	float stime = u_time / 5.0;

    vec4 sampled = texture2D(u_texture, c + vec2(sin(stime/3.0 + coords.x/3.0 + coords.y/3.0) * v.x, 0.0) / 3.0);
    vec3 color = sampled.rgb * vec3(0.9, 0.9, 1);

    float actcoords = (sin(stime / 30.0) * 5.0 )+ 40.0;

    float tester = mod((coords.x + coords.y * 1.5)
                    + sin(stime / 3.0 + coords.x/2.0) * 2.0
                    + sin(stime / 8.0 - coords.y/4.0) * 2.0
                    + sin(stime / 8.0 + coords.y)
                    + sin(stime / 12.0 + coords.x/3.0) * 3.0
                      ,actcoords);
    float mth = (sin(stime / 10.0) * 3.0) + 8.0;

    if(mth > tester){
        color *= 1.2;
    }
	gl_FragColor = vec4(color.rgb, min(sampled.a * 100.0, 1.0));
}