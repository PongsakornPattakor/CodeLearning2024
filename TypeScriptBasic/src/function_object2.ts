const position: { lat: number; lon: number } = { lat: 10, lon: 20 };

const random = (): { lat: number; lon: number } => {
  return {
    lat: parseFloat(Math.random().toFixed(2)),
    lon: parseFloat(Math.random().toFixed(2)),
  };
};

console.log(random());
