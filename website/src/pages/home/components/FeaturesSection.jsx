import React from "react";
import FeatureCard from "./FeatureCard";
import "./css/Feature.css";

export default function FeaturesSection() {
  const features = [
    {
      "image": "assets/undraw_building-blocks_h5jb.png",
      title: "Block Based Programming",
      description:
        "No knowledge of code required, just writing of logic with blocks.",
    },
    {
      image: "/assets/1771688992717.jpg",
      title: "Gradle",
      description:
        "Stay ahead of the curve by building your projects with the newest and most advanced Gradle build system.",
    },
    {
      image: "/assets/1771688740840.jpg",
      title: "Integrated Terminal",
      description:
        "Run the commands, linux based command system in your mobile..",
    },
    {
      image: "/assets/1771688992738.jpg",
      title: "Block documentation",
      description:
        "Block are documented from java doc so that you always know what is the use of a block.",
    },
    {
      image: "/assets/1771688992759.jpg",
      title: "Your App Code",
      description:
        "Curious how your app is coded? You can always see the generated code in the IDE",
    },
  ];

  return (
    <section className="features-section">
      {features.map((feature, index) => (
        <FeatureCard key={index} {...feature} />
      ))}
    </section>
  );
}